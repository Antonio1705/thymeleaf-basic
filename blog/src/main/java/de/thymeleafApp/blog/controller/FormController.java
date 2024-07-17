package de.thymeleafApp.blog.controller;

import de.thymeleafApp.blog.entity.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FormController {

    @GetMapping("/registration")
    public String userRegistrationPage(Model model){

        UserForm userForm= new UserForm();
        model.addAttribute("userform",userForm);

        List<String> listProfession = List.of("Developer", "Tester", "Architect");
        model.addAttribute("professions",listProfession);

        return "form";
    }

    @PostMapping("/registration/save")
    public String submitForm(Model model, @ModelAttribute("userform") UserForm userForm){

        model.addAttribute("userform",userForm);


        return "registration-success";

    }
}
