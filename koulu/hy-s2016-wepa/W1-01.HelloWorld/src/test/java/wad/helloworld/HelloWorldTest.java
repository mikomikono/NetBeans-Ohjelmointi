package wad.helloworld;

import fi.helsinki.cs.tmc.edutestutils.Points;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloWorldController.class)
@Points("1")
public class HelloWorldTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void helloWorldTest() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(content().string("Hello World!"));

    }
}
