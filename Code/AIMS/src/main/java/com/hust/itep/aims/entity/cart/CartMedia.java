package com.hust.itep.aims.entity.cart;

import com.hust.itep.aims.entity.media.Media;

public class CartMedia {

    private Media media;
    private int quantity;
    private int price;

    public CartMedia(Media media, int quantity, int price) {
        this.media = media;
        this.quantity = quantity;
        this.price = price;
    }

    public CartMedia(){};

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
