package com.potionsbyfreya.songr.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository  extends JpaRepository<Album, Long> {
    public Album findByTitleOfAlbum(Album title);
}
