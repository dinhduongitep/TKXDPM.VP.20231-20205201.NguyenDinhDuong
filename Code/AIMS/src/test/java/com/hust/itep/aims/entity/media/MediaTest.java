package com.hust.itep.aims.entity.media;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MediaTest {

    @Test
    void mediaTest1() throws ParseException {
        Media media = new Media();
        media.setId(BigInteger.valueOf(1));
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
        media.setType("Social Media");
        assertEquals(media.getId(), BigInteger.valueOf(1));
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
        assertEquals(media.getType(), "Social Media");
    }

    @Test
    void mediaTest2() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse("18/11/2023");
        Media media = new Media(BigInteger.valueOf(2), "dvd", 100000, 10, "TestMedia", "Description", 50, date, true, "Social Media");
        assertEquals(media.getId(), BigInteger.valueOf(2));
        assertEquals(media.getCategory(), "dvd");
        assertEquals(media.getPrice(), 100000);
        assertEquals(media.getValue(), 10);
        assertEquals(media.getTitle(), "TestMedia");
        assertEquals(media.getDescription(), "Description");
        assertEquals(media.getQuantity(), 50);
        assertEquals(media.getImportDate(), date);
        assertEquals(media.getRushOrderSupport(), true);
        assertEquals(media.getType(), "Social Media");
    }
}