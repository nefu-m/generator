package com.xx.test.dao;

import com.xx.test.model.password;

public interface passwordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(password record);

    int insertSelective(password record);

    password selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(password record);

    int updateByPrimaryKey(password record);
}