package com.zt.consumer.controller;

import com.zt.model.Chapter;
import com.zt.service.IChapter;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChapterController {
    @Reference
    IChapter chapter;
    @RequestMapping("/getChapter")
    public Chapter GetChapter(Integer id){
        try {
            return chapter.getOne(id);
        }catch (Exception e){
            e.printStackTrace();
        }
       return null;
    }
}
