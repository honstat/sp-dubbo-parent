package com.zt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zt.model.CloneChapter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ChapterMapper extends BaseMapper<CloneChapter> {
    @Select("select * from clone_chapter where book_id=#{book_id} limit #{offset},#{page_size}")
    List<CloneChapter> getBookChapters(@Param("book_id") Integer bookId, @Param("offset")Integer offset, @Param("page_size")Integer pageSize);
}
