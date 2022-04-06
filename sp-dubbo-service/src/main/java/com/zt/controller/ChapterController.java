package com.zt.controller;

import com.zt.model.Chapter;
import com.zt.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChapterController {
    @Autowired
    private ChapterService chapterService;
    @RequestMapping("/getChapter")
    public Chapter getChapter(@RequestParam("id") Integer id){
        return  chapterService.getOne(id);
    }
}
