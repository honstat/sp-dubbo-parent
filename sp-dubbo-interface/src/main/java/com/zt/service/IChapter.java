package com.zt.service;

import com.zt.model.Chapter;

import java.util.List;

public interface IChapter {
    /**
     * 获取单章
     * @param id
     * @return
     */
    Chapter getOne(Integer id);

    /**
     * 获取某本书的章节列表
     * @param bookId
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<Chapter> getList(Integer bookId,Integer pageIndex,Integer pageSize);
}
