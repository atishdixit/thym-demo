package com.extellon.one.web;

import com.extellon.one.domain.User;
import com.extellon.one.domain.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ThymDemoController {

    @GetMapping("/get-request")
    public String getRequest(Model model){
        model.addAttribute("message", "Hi successfully get response");
        return "welcome";
    }

    @GetMapping("/get-user")
    public String getUser(Model model){
        model.addAttribute("user", new User(10, "Atish", "atish@dixit.com", "Jalandhar", true, "USER", "MALE"));
        model.addAttribute("user1", new User(10, "Atish", "atish@dixit.com", "Jalandhar", true, "USER", "MALE"));
        List<User> users = Arrays.asList(
                 new User(100, "Atish", "atish@dixit.com", "Jalandhar", true, "ADMIN", "MALE")
                , new User(101, "Atish", "atish@dixit.com", "Jalandhar", true, "USER", "MALE")
                , new User(102, "Atish", "atish@dixit.com", "Jalandhar", true, "USER", "MALE")
                , new User(103, "Atish", "atish@dixit.com", "Jalandhar", true, "ADMIN", "MALE")
                , new User(104, "Atish", "atish@dixit.com", "Jalandhar", true, "USER", "MALE"));

        model.addAttribute("users", users);
        return "user";
    }


    @GetMapping("/register")
    public String register(Model model){
        UserForm userForm =  new UserForm();
        model.addAttribute("userForm", userForm);
        List<String> professions = Arrays.asList("Developer", "Tester", "Architect");
        model.addAttribute("professionList", professions);
        return "register-form";
    }

    @PostMapping("/register/save")
    public String save(Model model, @ModelAttribute("userForm")UserForm userForm){
        System.out.println("hello");
        model.addAttribute("userForm", userForm);
        return "register-success";
    }
}
