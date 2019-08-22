package com.potionsbyfreya.songr.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
    public Song findBySongTitle(String title);

}
