package com.ssm.zi.dao;

import com.ssm.zi.model.AppCategory;
import com.ssm.zi.model.AppCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppCategoryMapper {
    List<AppCategory> nox(Long pid);

    List<AppCategory> no1();

    String selectCate(Long id);

    long countByExample(AppCategoryExample example);

    int deleteByExample(AppCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppCategory record);

    int insertSelective(AppCategory record);

    List<AppCategory> selectByExample(AppCategoryExample example);

    AppCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppCategory record, @Param("example") AppCategoryExample example);

    int updateByExample(@Param("record") AppCategory record, @Param("example") AppCategoryExample example);

    int updateByPrimaryKeySelective(AppCategory record);

    int updateByPrimaryKey(AppCategory record);
}