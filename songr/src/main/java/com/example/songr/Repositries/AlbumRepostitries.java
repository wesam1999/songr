package com.example.songr.Repositries;

import com.example.songr.Models.AlbumModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepostitries extends JpaRepository<AlbumModel,Integer> {
        }
