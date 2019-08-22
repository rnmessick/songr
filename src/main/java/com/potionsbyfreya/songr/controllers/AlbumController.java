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

import javax.jws.WebParam;
import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model a) {
        List<Album> albums = albumRepository.findAll();
        a.addAttribute("albums", albums);
        return "allAlbums";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(String title, String artist, Integer songCount, Integer lengthInSeconds, String imageUrl) {
        Album a = new Album(title, artist, songCount, lengthInSeconds, imageUrl);
        albumRepository.save(a);
        return new RedirectView("/albums");
    }


}
