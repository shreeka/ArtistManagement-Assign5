/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.artistmanagement;

import com.shreeka.artistmanagement.dao.ArtistDAO;
import com.shreeka.artistmanagement.entity.Artist;
import com.shreeka.artistmanagement.impl.ArtistDAOImpl;
import java.util.Scanner;

/**
 *
 * @author Decode
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        ArtistDAO artistDAO=new ArtistDAOImpl();
        while(true)
        {
            System.out.println("");
        System.out.println("1.Add Artist");
        System.out.println("2.Delete Artist");
        System.out.println("3.Show All");
        System.out.println("4.Search by name");
            System.out.println("5.Update a artist");
        System.out.println("6.Exit");
        System.out.print("Enter your choice [1-5]: ");
        
        switch(input.nextInt())
        {
            case 1:
                Artist c=new Artist();
                System.out.println("Add new artist");
                System.out.print("Enter artist Id: ");
                c.setId(input.nextInt());
                System.out.print("Enter artist name: ");
                c.setName(input.next());
                System.out.print("Enter genre: ");
                c.setGenre(input.next());
                System.out.print("Enter no of albums: ");
                c.setAlbums(input.nextInt());
                               
                
                if(artistDAO.insert(c))
                {
                    System.out.println("Inserted successfully");
                }else
                    System.out.println("Data full");
                
                break;
                
            case 2:
                System.out.print("Enter artist id to be deleted: ");
                if(artistDAO.delete(input.nextInt()))
                {
                    System.out.println("Artist deleted.");   
                }else
                    System.out.println("Null artist id. Cannot be deleted. ");
                break;
                
            case 3:
                System.out.println("Display all artists");
                Artist[] artistList= artistDAO.getAll();
                for(int i=0;i<artistList.length;i++)
                {   if(artistList[i]!=null)
                {
                    System.out.println("Artist id: "+artistList[i].getId());
                    System.out.println("Artist name: "+artistList[i].getName());
                    System.out.println("Genre: "+artistList[i].getGenre());
                    System.out.println("Artist no of albums: "+artistList[i].getAlbums());
                    System.out.println("");
                }
                }
                break;
                
            case 4:
                System.out.print("Enter artist name to be searched: ");
                System.out.println("");
                Artist artist= artistDAO.getByName(input.next());
                if(artist!=null){
                System.out.println("Artist id: "+artist.getId());
                System.out.println("Artist name: "+artist.getName());
                System.out.println("Genre: "+artist.getGenre());
                System.out.println("Artist no of albums: "+artist.getAlbums());
                }else
                    System.out.println("Artist could not be found.");
                break;
                
            case 5:
                System.out.print("Enter artist name to be updated: ");
                String name=input.next();
                Artist cupdate=artistDAO.getByName(name);
                if(cupdate!=null){

                System.out.println("1. Update artist id");
                System.out.println("2. Update artist name");
                System.out.println("3. Update genre");
                    System.out.println("4.Update no of albums");
                System.out.print("Enter your choice: ");
                switch(input.nextInt())
                {
                    case 1:
                        System.out.print("Enter new artist id: ");
                        cupdate.setId(input.nextInt());
                        break;
                    case 2:
                        System.out.print("Enter new artist name: ");
                        cupdate.setName(input.next());
                        break;
                    case 3:
                        System.out.print("Enter new genre: ");
                        cupdate.setGenre(input.next());
                        break;
                    case 4:
                        System.out.print("Enter new no of albums: ");
                        cupdate.setAlbums(input.nextInt());
                        break;
                }
                    System.out.println("Updated successfully");
                }else
                System.out.println("Artist could not be found.");
                break;
                
            case 6:
                System.out.print("Do you really want to exit?(y/n)");
                if((input.next()).equalsIgnoreCase("y")){
                System.exit(0);
                }
                break;
                    
        }
        }
    }
   
    
}
