package com.example.songr.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChatUser {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String username;
    public String password;

    public ChatUser() {
    }

    public ChatUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
