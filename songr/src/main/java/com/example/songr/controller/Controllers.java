package com.example.songr.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class Controllers {

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





}

