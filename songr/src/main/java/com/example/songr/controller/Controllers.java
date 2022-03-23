package com.example.songr.controller;

import com.example.songr.Models.AlbumModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class Controllers {
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
    public String splash(){


        return "App";
    }
@ResponseBody
    @GetMapping("/albums")
    public ArrayList<AlbumModel> albums(){

AlbumModel albums1  = new AlbumModel("dsadas","gfdgdf",23,23,"vcxv");
    AlbumModel albums2  = new AlbumModel("dfgdfg","gfhg",12,2,"hjhg");
    AlbumModel albums3  = new AlbumModel("dsadas","ioiuop",1,5,"sdfdsf");
    ArrayList<AlbumModel> cars = new ArrayList<AlbumModel>();
cars.add(albums1);
    cars.add(albums2);
    cars.add(albums3);
    return cars;
}



}

