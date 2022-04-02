package com.example.songr.Repositries;

import com.example.songr.Models.AlbumModel;
import com.example.songr.Models.ChatUser;
import org.springframework.data.repository.CrudRepository;

public interface ChatUserRepositrie extends CrudRepository<ChatUser,Integer> {
ChatUser findByUsername(String username);

}
