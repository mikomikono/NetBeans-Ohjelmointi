package wad.hellofirebase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloFirebaseController {

    @Autowired
    private FirebaseService firebaseService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String get(Model model) {
        model.addAttribute("items", firebaseService.list());
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String add(@RequestParam String name) {
        firebaseService.add(new FirebaseItem(name));
        return "redirect:/";
    }
}
