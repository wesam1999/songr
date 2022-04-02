package com.example.songr.controller;
import com.example.songr.Repositries.ChatUserRepositrie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class Controllers {
@Autowired
    ChatUserRepositrie chatUserRepositrie;

    @GetMapping("/")
    public String Homepage(){


        return "Home1";
    }


    @GetMapping("/hello")
   public String helloApp(){
        System.out.println("hello world");

return "Home1";
            }


 @GetMapping("/capitalize/{hello}")
    public  String capitalize(@PathVariable String hello,Model model){
           String upper= hello.toUpperCase();
     model.addAttribute("value",upper);


        return "Home";
            }
    @GetMapping("/withSecret")
    public String getHomepageWithSecret(HttpServletRequest request, Model m)
    {
        HttpSession session = request.getSession();
        String username = session.getAttribute("username").toString();

        m.addAttribute("username", username);

        return "indexWithSecret.html";
    }





}

