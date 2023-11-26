package com.hust.itep.aims.controller;

import com.hust.itep.aims.entity.media.Media;
import com.hust.itep.aims.service.MediaService;


import java.util.List;

public class HomeController extends BaseController{
    public List getAllMedia() {
        return new MediaService().getAllMedia();
    }
}
