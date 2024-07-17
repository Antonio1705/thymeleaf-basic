package de.thymeleafApp.blog.controller;

import de.thymeleafApp.blog.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/hello")
    public String helloworld(Model model) {

        User user = new User();

        System.out.println();

        user.setId("1");
        user.setName("User22");
        user.setPassword("blllaa");
        user.setEmail("bla@Gmail.com");
        user.setRole("user");

        String message = "Hello World Antnionio";
        model.addAttribute("userbla", user);

        return "hello";
    }

    @Value("${welcome.message.hi}")
    private String userBucketPath;

    @GetMapping("/index")
    public String getSelectionExpression(Model model) {
        model.addAttribute("mes", userBucketPath);
        System.out.println(model.getAttribute("mes") + "<<<<<<<<<<<<<<");
        return "index";
    }

    @GetMapping("/fragment")
    public String getFragmentExpression() {
        return "fragment";
    }

    @GetMapping("/iteration")
    public String getIteration(Model model) {
        User userAntonio = new User("22", "Antonio", "antonio@gmail.de", "Azubi", "passwordgeheim");
        User userVojkan = new User("23", "Vojkan", "vojkan@gmail.de", "ProductOwner", "ownerPassword");
        User userLjubo = new User("24", "Ljubo", "Ljubo@gmail.de", "Azubi", "ownerPassword");

        model.addAttribute("users", List.of(userAntonio, userVojkan, userLjubo));

        return "iteration";
    }

    @GetMapping("/controlstructure")
    public String getControlStructure(Model model) {
        User userAntonio = new User("22", "Antonio", "antonio@gmail.de", "Azubi", "passwordgeheim");
        User userVojkan = new User("23", "Vojkan", "vojkan@gmail.de", "ProductOwner", "ownerPassword");
        User userLjubo = new User("24", "Ljubo", "Ljubo@gmail.de", "Azubi", "ownerPassword");

        model.addAttribute("users", List.of(userAntonio, userVojkan, userLjubo));
        return "control-structure";
    }

    @GetMapping("/switch")
    public String getControlStructureSwitch(Model model) {
        User userAntonio = new User("22", "Antonio", "antonio@gmail.de", "Azubi", "passwordgeheim");
        User userVojkan = new User("23", "Vojkan", "vojkan@gmail.de", "ProductOwner", "ownerPassword");
        User userLjubo = new User("24", "Ljubo", "Ljubo@gmail.de", "Azubi", "ownerPassword");

        model.addAttribute("users", List.of(userAntonio, userVojkan, userLjubo));
        return "switch";
    }
}
