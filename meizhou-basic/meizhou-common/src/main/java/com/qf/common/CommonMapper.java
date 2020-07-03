package com.qf.common;

import java.util.List;

public interface CommonMapper<T> {

    List<T> selectAll();

    int deleteByPrimaryKey(Long id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
