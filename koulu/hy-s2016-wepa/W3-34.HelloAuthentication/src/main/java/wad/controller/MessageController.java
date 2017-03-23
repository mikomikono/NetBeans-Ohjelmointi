package wad.controller;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import wad.domain.Message;
import wad.repository.MessageRepository;

@Controller
public class MessageController {
    
    @Autowired
    private MessageRepository messageRepository;

    @PostConstruct
    public void init() {
        Message msg = new Message();
        msg.setContent("Jeff Davis");
        messageRepository.save(msg);
    }

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
            messageRepository.save(msg);
        }

        return "redirect:/messages";
    }
}
