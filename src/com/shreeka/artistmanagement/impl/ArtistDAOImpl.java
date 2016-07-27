/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.artistmanagement.impl;

import com.shreeka.artistmanagement.dao.ArtistDAO;
import com.shreeka.artistmanagement.entity.Artist;

/**
 *
 * @author Decode
 */
public class ArtistDAOImpl implements ArtistDAO {
    
    private int counter=0;
    private Artist[] artistList=new Artist[10];

    @Override
    public boolean insert(Artist c) {
        if(counter<artistList.length)
        {
            artistList[counter]=c;
            counter++;
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        for(int i=0;i<artistList.length;i++)
        {
            Artist c=artistList[i];
            if(c!=null && c.getId()==id)
            {
                c=null;
                return true;
            }
        }
        return false;
    }

    

    @Override
    public Artist[] getAll() {
        return artistList;
    }

    @Override
    public Artist getByName(String name) {
        for(int i=0;i<artistList.length;i++)
        {
            Artist c= artistList[i];
            if(c!=null && (c.getName()).equalsIgnoreCase(name)){
            return c;
            }
        }
        return null;  
    }
    
}
