package com.example.songr.controller;

import com.example.songr.Models.AlbumModel;
import com.example.songr.Models.SongModel;
import com.example.songr.Repositries.AlbumRepostitries;
import com.example.songr.Repositries.SongRepostitries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class Controllers {
@Autowired
    AlbumRepostitries albumRepostitries;

@Autowired
    SongRepostitries songRepostitries;
    //
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

    @GetMapping("/")
    public String splash(@ModelAttribute AlbumModel albumModel){

        albumRepostitries.save(albumModel);
        return "App";
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
    @GetMapping("/allsong")
    public String AllSong(@ModelAttribute SongModel songModel){

        songRepostitries.save(songModel);
        return "App2";
    }
    @GetMapping("/Song")
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

