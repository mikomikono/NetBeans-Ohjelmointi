package wad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import wad.domain.Message;
import wad.repository.MessageRepository;
import wad.repository.AccountRepository;

@Controller
public class UserController {

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private AccountRepository userDetailsRepository;

    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("messages", messageRepository.findAll());
        return "messages";
    }

    @RequestMapping(value = "/messages", method = RequestMethod.POST)
    public String add(@RequestParam String content) {
        if (content != null && !content.trim().isEmpty()) {
            Message msg = new Message();
            msg.setContent(content.trim());

            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            String username = auth.getName();

            msg.setUser(userDetailsRepository.findByUsername(username));
            messageRepository.save(msg);
        }

        return "redirect:/messages";
    }
}
