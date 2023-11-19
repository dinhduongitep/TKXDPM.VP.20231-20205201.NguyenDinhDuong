package com.hust.itss.controller;

import com.hust.itss.entity.media.Media;
import com.hust.itss.service.MediaService;

import java.sql.SQLException;
import java.util.List;

public class HomeController extends BaseController{
    public List getAllMedia() {
        return new MediaService().getAllMedia();
    }
}
