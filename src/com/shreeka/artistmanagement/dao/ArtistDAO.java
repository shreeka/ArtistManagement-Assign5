/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.artistmanagement.dao;

import com.shreeka.artistmanagement.entity.Artist;


/**
 *
 * @author Decode
 */
public interface ArtistDAO {
   
     boolean insert(Artist s);
    boolean delete(int id);
    Artist getByName(String name);
    Artist[] getAll();
    
}
