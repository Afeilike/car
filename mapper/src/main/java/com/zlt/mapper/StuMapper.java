package com.zlt.mapper;

import com.zlt.pojo.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StuMapper {

    @Select("select * from stu")
    public List<Stu> findAll();

}
