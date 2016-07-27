/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.artistmanagement.entity;

/**
 *
 * @author Decode
 */
public class Artist {
    
    private int id;
    private String name,genre;
    private int albums;

    public Artist() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getAlbums() {
        return albums;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAlbums(int albums) {
        this.albums = albums;
    }

    
    
    
    
}
