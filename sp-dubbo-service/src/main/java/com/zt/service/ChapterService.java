package com.zt.service;

import com.zt.dao.ChapterMapper;
import com.zt.model.Chapter;
import com.zt.model.CloneChapter;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Slf4j
@Component
public class ChapterService implements IChapter {
    @Autowired
    private ChapterMapper chapterMapper;
    @Override
    public Chapter getOne(Integer id) {
        CloneChapter cloneChapter = chapterMapper.selectById(id);
        Chapter chapter=new Chapter();
        chapter.setId(cloneChapter.getId());
        chapter.setBook_id(cloneChapter.getBook_id());
        chapter.setNo(cloneChapter.getNo());
        chapter.setTitle(cloneChapter.getTitle());
        chapter.setUrl(cloneChapter.getUrl());
        chapter.setSimHash(cloneChapter.getSimHash());
        return chapter;
    }

    @Override
    public List<Chapter> getList(Integer bookId, Integer pageIndex, Integer pageSize) {
        Integer offset=(pageIndex-1)*pageSize;
        List<CloneChapter> list=  chapterMapper.getBookChapters(bookId,offset,pageSize);
        log.info("查到总条数:"+(list!=null?list.size():0));
        return null;
    }
}
