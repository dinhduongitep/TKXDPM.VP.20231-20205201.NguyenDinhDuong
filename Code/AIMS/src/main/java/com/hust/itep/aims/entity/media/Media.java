package com.hust.itep.aims.entity.media;

import java.math.BigInteger;
import java.util.Date;

public class Media {

    private BigInteger id;
    private String category;
    private int price;
    private int value;
    private String title;
    private String description;
    private String barcode;
    private int quantity;
    private Date importDate;
    private Boolean rushOrderSupport;
    private String imageUrl;
    private String type;

    public Media(BigInteger id, String category, int price, int value, String title, String description, int quantity, Date importDate, Boolean rushOrderSupport, String type) {
        this.id = id;
        this.category = category;
        this.price = price;
        this.value = value;
        this.title = title;
        this.description = description;
        this.quantity = quantity;
        this.importDate = importDate;
        this.rushOrderSupport = rushOrderSupport;
        this.type = type;
    }

    public Media() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public Boolean getRushOrderSupport() {
        return rushOrderSupport;
    }

    public void setRushOrderSupport(Boolean rushOrderSupport) {
        this.rushOrderSupport = rushOrderSupport;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", value=" + value +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", barcode='" + barcode + '\'' +
                ", quantity=" + quantity +
                ", importDate=" + importDate +
                ", rushOrderSupport=" + rushOrderSupport +
                ", imageUrl='" + imageUrl + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
