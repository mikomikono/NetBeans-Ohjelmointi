package wad;

import fi.helsinki.cs.tmc.edutestutils.Points;
import org.fluentlenium.adapter.FluentTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Points("34")
public class HelloAuthenticationTest extends FluentTest {

    public WebDriver webDriver = new HtmlUnitDriver();

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

    @LocalServerPort
    private Integer port;

    @Test
    public void pageShouldNotBeDirectlyAccessible() {
        goTo("http://localhost:" + port + "/messages");
        assertThat(pageSource()).doesNotContain("Jeff Davis");
    }

    @Test
    public void shouldSeeLoginPageOnAccessingMessages() {
        goTo("http://localhost:" + port + "/messages");
        assertThat(find(By.name("username"))).isNotNull();
        assertThat(find(By.name("password"))).isNotNull();
    }

    @Test
    public void noAuthOnWrongPassword() {
        goTo("http://localhost:" + port + "/messages");
        enterDetailsAndSubmit("Onni", "v123");
        assertThat(pageSource()).doesNotContain("Jeff Davis");
    }

    @Test
    public void authSuccessfulOnCorrectPassword() {
        goTo("http://localhost:" + port + "/messages");

        enterDetailsAndSubmit("maxwell_smart", "kenkapuhelin");
        assertThat(pageSource()).contains("Jeff Davis");
    }

    private void enterDetailsAndSubmit(String username, String password) {
        fill(find(By.name("username"))).with(username);
        fill(find(By.name("password"))).with(password);
        find(By.name("password")).submit();
    }
}
