package com.potionsbyfreya.songr.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    int songCount;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "album")
    List<Song> songs;

    int lengthInSeconds;
    String imageUrl;



    public Album() {}

    public Album(String title, String artist, int songCount, int lengthInSeconds, String imageUrl ) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSeconds = lengthInSeconds * 60;
        this.imageUrl = imageUrl;

    }

    public Album(Object album) {

    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public List<Song> getSong() { return songs;}

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public String getImageUrl() {
        return imageUrl;
    }


    //A user should be able to see information about all the albums on the site.
    //A user should be able to add albums to the site.
}
