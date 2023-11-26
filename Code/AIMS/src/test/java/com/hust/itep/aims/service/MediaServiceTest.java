package com.hust.itep.aims.service;

import org.junit.jupiter.api.Test;

import static javafx.beans.binding.Bindings.when;
import static org.junit.jupiter.api.Assertions.*;

class MediaServiceTest {

    @Test
    void getAllMedia() {
        MediaService instance = new MediaService();
        assertEquals(instance.getAllMedia().size(), 2);
    }
}