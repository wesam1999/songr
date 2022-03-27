package com.example.songr.controller;

import com.example.songr.Models.AlbumModel;
import com.example.songr.Repositries.AlbumRepostitries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class AlbumController {
    @Autowired
    AlbumRepostitries albumRepostitries;


    @GetMapping("/album")
    public String splash(@ModelAttribute AlbumModel albumModel){

        albumRepostitries.save(albumModel);
        return "App";
    }
    @GetMapping("/albums/{id}")
    public String Onealbums(Model model,@PathVariable int id){

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
        model.addAttribute("allAlbum", albumRepostitries.findAll());
        return "Albums";
    }
    @GetMapping("/albums")
    public String albums(Model model){

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
        model.addAttribute("allAlbum", albumRepostitries.findAll());
        return "Albums";
    }

}
