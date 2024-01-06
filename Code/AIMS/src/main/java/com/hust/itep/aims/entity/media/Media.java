package com.hust.itep.aims.entity.media;

import java.text.DecimalFormat;
import java.util.Date;

public class Media {

    private int id;
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
    private String productDimension;

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public void setRushOrderSupport(Boolean rushOrderSupport) {
        this.rushOrderSupport = rushOrderSupport;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setProductDimension(String productDimension) {
        this.productDimension = productDimension;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public int getValue() {
        return value;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getImportDate() {
        return importDate;
    }

    public Boolean getRushOrderSupport() {
        return rushOrderSupport;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getProductDimension() {
        return productDimension;
    }

    public Media (){
    };

    public Media(int id, String title, int price, String category, int quantity) {
        this.id = id;
        this.category = category;
        this.price = price;
        this.title = title;
        this.quantity = quantity;
    };

    public Media(Integer id, String category, int price, int value, String title, String description, int quantity, Date importDate, Boolean rushOrderSupport, String barcode, String productDimension, String imageUrl) {
        this.id = id;
        this.category = category;
        this.price = price;
        this.value = value;
        this.title = title;
        this.description = description;
        this.quantity = quantity;
        this.importDate = importDate;
        this.rushOrderSupport = rushOrderSupport;
        this.productDimension = productDimension;
        this.barcode = barcode;
        this.imageUrl = imageUrl;
    }
    public Object[] toTableRow(int rowNum) {
        DecimalFormat dfPrice = new DecimalFormat("#,##0.00");
        DecimalFormat df = new DecimalFormat("#,##0.##");
        return new Object[]{
                this,
                df.format(rowNum),
                title,
                category,
                dfPrice.format(price)+" VND",
                df.format(quantity),
                dfPrice.format( quantity*price)+" VND"};
    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", value=" + value +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", productDimension='" + productDimension + '\'' +
                ", barcode='" + barcode + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", rushOrderSupport=" + rushOrderSupport +
                // add other fields if present
                '}';
    }
}
