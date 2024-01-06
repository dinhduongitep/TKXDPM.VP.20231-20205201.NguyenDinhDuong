//package com.hust.itep.aims.service;
//
//import com.hust.itep.aims.entity.media.Media;
//import com.hust.itep.aims.service.admin.MediaService;
//import org.junit.jupiter.api.Test;
//
//import static javafx.beans.binding.Bindings.when;
//import static org.junit.jupiter.api.Assertions.*;
//
//class MediaServiceTest {
//
//    @Test
//    void getAllMedia() {
//        MediaService instance = new MediaService();
//        assertEquals(instance.getAllMedia().size(), 2);
//    }
//
//    @Test
//    void getMediaById() {
//        MediaService instance = new MediaService();
//        assertNotNull(instance.getMediaById(1));
//        assertNull(instance.getMediaById(3));
//    }
//
//    @Test
//    void getQuantity(){
//        MediaService instance = new MediaService();
//        assertEquals(instance.getQuantity(1), 20);
//        assertEquals(instance.getQuantity(3), 0);
//    }
//}