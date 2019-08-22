package com.potionsbyfreya.songr.models;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String title;
    int lengthInSeconds;
    int trackNumber;


    @ManyToOne
    Album album;

    public Song() {}
    public Song(String title, Album album, int lengthInSeconds, int trackNumber) {
        this.title = title;
        this.album = album;
        this.lengthInSeconds = lengthInSeconds;
        this.trackNumber = trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public long getId() {
        return id;
    }

    public String getSongTitle() {
        return title;
    }

    public Album getAlbum() {
        return album;
    }

    public String toString() {
        return String.format("Track: %s Title: %s Length(in seconds): ", this.trackNumber, this.title, this.lengthInSeconds);
    }


}
