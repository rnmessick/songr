package com.potionsbyfreya.songr.models;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String trackTitle;
    int trackNumber;
    int lengthInSeconds;



    @ManyToOne
    Album album;

    public Song() {}
    public Song(Album album, String trackTitle, int lengthInSeconds, int trackNumber) {
        this.album = album;
        this.trackTitle = trackTitle;
        this.lengthInSeconds = lengthInSeconds;
        this.trackNumber = trackNumber;
    }

    public String getTrackTitle() {
        return this.trackTitle;
    }

    public int getLengthInSeconds() {
        return this.lengthInSeconds;
    }

    public int getTrackNumber() {
        return this.trackNumber;
    }

    public long getId() {
        return this.id;
    }

    public Album getAlbum() {
        return this.album;
    }


    public String toString() {
        return String.format("Track: %s Title: %s Length(in seconds): ", this.trackNumber, this.trackTitle, this.lengthInSeconds);
    }


}
