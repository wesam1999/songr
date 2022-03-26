package com.example.songr.Repositries;

import com.example.songr.Models.AlbumModel;
import com.example.songr.Models.SongModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepostitries extends JpaRepository<SongModel,Integer> {

}
