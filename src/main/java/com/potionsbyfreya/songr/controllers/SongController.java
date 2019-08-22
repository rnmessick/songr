package com.potionsbyfreya.songr.controllers;

import com.potionsbyfreya.songr.models.Album;
import com.potionsbyfreya.songr.models.AlbumRepository;
import com.potionsbyfreya.songr.models.Song;
import com.potionsbyfreya.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;


    @GetMapping("/albums/{id}")
    public String getAllSongsOnAlbum(@PathVariable long id, Model m) {
        List<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "oneAlbum";
    }

    @PostMapping("/albums/{id}")
    public RedirectView addSong(Album album, String title, Integer trackNumber, Integer lengthInSeconds) {
        Album a = albumRepository.findByTitleOfAlbum(album);
        if(a == null) {
            a = new Album(album);
            albumRepository.save(a);
        }
        Song s = new Song(title, a, trackNumber, lengthInSeconds);
        songRepository.save(s);
            return new RedirectView("/albums{id}");


    }
}
