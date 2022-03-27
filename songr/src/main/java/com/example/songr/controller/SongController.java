package com.example.songr.controller;

import com.example.songr.Models.SongModel;
import com.example.songr.Repositries.SongRepostitries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SongController  {
    @Autowired
    SongRepostitries songRepostitries;

    @GetMapping("/songs")
    public String AllSong(@ModelAttribute SongModel songModel){

        songRepostitries.save(songModel);
        return "App2";
    }
    @GetMapping("/song/{id}")
    public String OneSong(Model model,@PathVariable int id){

//AlbumModel albums1  = new AlbumModel("dsadas","gfdgdf",23,23,"vcxv");
//    AlbumModel albums2  = new AlbumModel("dfgdfg","gfhg",12,2,"hjhg");
//    AlbumModel albums3  = new AlbumModel("dsadas","ioiuop",1,5,"sdfdsf");
//    ArrayList<AlbumModel> cars = new ArrayList<AlbumModel>();
//cars.add(albums1);
//    cars.add(albums2);
//    cars.add(albums3);
//    albumRepostitries.save(albums1);
//    albumRepostitries.save(albums2);
//    albumRepostitries.save(albums3);
        System.out.println("---------------------------------");
        model.addAttribute("allSong", songRepostitries.findAll());
        return "Song";
    }
    @GetMapping("/song")
    public String Song(Model model){

//AlbumModel albums1  = new AlbumModel("dsadas","gfdgdf",23,23,"vcxv");
//    AlbumModel albums2  = new AlbumModel("dfgdfg","gfhg",12,2,"hjhg");
//    AlbumModel albums3  = new AlbumModel("dsadas","ioiuop",1,5,"sdfdsf");
//    ArrayList<AlbumModel> cars = new ArrayList<AlbumModel>();
//cars.add(albums1);
//    cars.add(albums2);
//    cars.add(albums3);
//    albumRepostitries.save(albums1);
//    albumRepostitries.save(albums2);
//    albumRepostitries.save(albums3);
        System.out.println("---------------------------------");
        model.addAttribute("allSong", songRepostitries.findAll());
        return "Song";
    }
}
