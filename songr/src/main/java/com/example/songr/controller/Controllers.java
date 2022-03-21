package com.example.songr.controller;

import com.example.songr.Models.AlbumModel;
import org.apache.catalina.startup.HomesUserDatabase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {

    @GetMapping("/hello")
   public String hello(){


return "Home";
            }
            @GetMapping("/capitalize/hello")
    public  String capitalize(){


        return "Home";
            }
    @GetMapping("/")
    public String splash(){


        return "App";
    }
    @GetMapping("/albums")
    public  String albums(Model model){
        AlbumModel albumModel=new AlbumModel("dsadas","gfdgdf",23,23,"fgfd");

        model.addAttribute(albumModel);
        return "Albums";
    }



}

