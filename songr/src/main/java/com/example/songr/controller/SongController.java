package com.example.songr.controller;

import com.example.songr.Models.AlbumModel;
import com.example.songr.Models.SongModel;
import com.example.songr.Repositries.SongRepostitries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController  {
    @Autowired
    SongRepostitries songRepostitries;


    @PostMapping("/songs")
    public RedirectView splash(@ModelAttribute SongModel songModel){
        songRepostitries.save(songModel);
        return new RedirectView("song");
    }

    @GetMapping("/song")
    public String Song(Model model){
        System.out.println("*************************************************************");
        model.addAttribute("allSong",songRepostitries.findAll());
        return "App2";
    }
}
