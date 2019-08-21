package com.potionsbyfreya.songr.models;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {
    //Feature Tasks
    //DONE:Create an Album model.
    //An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    int songCount;
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

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    //A user should be able to see information about all the albums on the site.
    //A user should be able to add albums to the site.
}
