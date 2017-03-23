package wad.controller;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import wad.domain.Account;
import wad.domain.Message;
import wad.repository.AccountRepository;
import wad.repository.MessageRepository;

@Controller
public class DefaultController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private AccountRepository userDetailsRepository;

    @PostConstruct
    public void init() {
        if (userDetailsRepository.findByUsername("maxwell") != null) {
            return;
        }

        Account user = new Account();
        user.setUsername("maxwell");
        user.setPassword(passwordEncoder.encode("smart"));

        user = userDetailsRepository.save(user);

        Message msg = new Message();
        msg.setUser(user);
        msg.setContent("Jeff Davis");
        messageRepository.save(msg);
    }

    @RequestMapping("*")
    public String handleDefault() {
        return "redirect:/messages";
    }
}
