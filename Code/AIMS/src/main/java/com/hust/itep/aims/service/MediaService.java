package com.hust.itep.aims.service;

import com.hust.itep.aims.entity.media.Media;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class MediaService {

    Media media1 = new Media(BigInteger.valueOf(1), "category 1", 120000, 5, "title", "description", 10, null, true , "type");
    Media media2 = new Media(BigInteger.valueOf(2), "category 2", 200000, 10, "title", "description", 20, null, true , "type");


    public List getAllMedia() {
        ArrayList media = new ArrayList<>();
        media.add(media1);
        media.add(media2);
        for (int i = 0; i < media.size(); i++){
            Media medium = (Media) media.get(i);
            medium.getId();
            medium.getTitle();
            medium.getQuantity();
            medium.getCategory();
            medium.getImageUrl();
            medium.getPrice();
            medium.getType();
            //System.out.println(medium.toString());
        }

        return media;
    }

    public Media getMediaById(int id) {
        ArrayList media = new ArrayList<>();
        media.add(media1);
        media.add(media2);
        for (int i = 0; i < media.size(); i++){
            if (i == id){
                Media medium = (Media) media.get(i);
                medium.getId();
                medium.getTitle();
                medium.getQuantity();
                medium.getCategory();
                medium.getImageUrl();
                medium.getPrice();
                medium.getType();
                //System.out.println(medium.toString());
                return medium;
            }
        }
        return null;
    }


    public int getQuantity(int id)  {
        Media media = new Media();
        media = this.getMediaById(id);
        return media.getQuantity();
    }
}
