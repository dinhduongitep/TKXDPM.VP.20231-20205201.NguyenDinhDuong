package com.hust.itep.aims.entity.media;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MediaTest {

    @Test
    void mediaTest1() throws ParseException {
        Media media = new Media();
        media.setId(1);
        media.setCategory("book");
        media.setPrice(50000);
        media.setValue(10);
        media.setTitle("Test Media");
        media.setDescription("Description");
        media.setBarcode("123abc");
        media.setQuantity(50);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse("18/11/2023");
        media.setImportDate(date);
        media.setRushOrderSupport(true);
        media.setImageUrl("url//image");
        assertEquals(media.getId(), 1);
        assertEquals(media.getCategory(), "book");
        assertEquals(media.getPrice(), 50000);
        assertEquals(media.getValue(), 10);
        assertEquals(media.getTitle(), "Test Media");
        assertEquals(media.getDescription(), "Description");
        assertEquals(media.getBarcode(), "123abc");
        assertEquals(media.getQuantity(), 50);
        assertEquals(media.getImportDate(), date);
        assertEquals(media.getRushOrderSupport(), true);
        assertEquals(media.getImageUrl(), "url//image");
    }

    @Test
    void mediaTest2() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse("18/11/2023");
        Media media = new Media(2, "dvd", 100000, 10, "TestMedia", "Description", 50, date, true ,"999", "product", "1.png");
        assertEquals(media.getId(), 2);
        assertEquals(media.getCategory(), "dvd");
        assertEquals(media.getPrice(), 100000);
        assertEquals(media.getValue(), 10);
        assertEquals(media.getTitle(), "TestMedia");
        assertEquals(media.getDescription(), "Description");
        assertEquals(media.getQuantity(), 50);
        assertEquals(media.getImportDate(), date);
        assertEquals(media.getRushOrderSupport(), true);
    }

    @Test
    void testToString() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse("18/11/2023");
        Media media = new Media(2, "TestMedia", 10000, "product", 50);
        String excepted = "Media{id=2, title='TestMedia', category='product', price=10000, value=0, quantity=50, description='null', productDimension='null', barcode='null', imageUrl='null', rushOrderSupport=null}";
        assertEquals(media.toString(), excepted);
    }
}