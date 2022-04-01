package com.example.songr.controller;

import com.example.songr.Models.AlbumModel;
import com.example.songr.Repositries.AlbumRepostitries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepostitries albumRepostitries;



    @PostMapping("/albums")
    public RedirectView splash(@ModelAttribute AlbumModel albumModel){ //modelAttribute when working with forms
        albumRepostitries.save(albumModel);
        return new RedirectView("album");
    }


    @GetMapping("/album")
    public String albums(Model model){
        System.out.println("*************************************************************");
        model.addAttribute("allAlbum",albumRepostitries.findAll());
        return "App";
    }
}
