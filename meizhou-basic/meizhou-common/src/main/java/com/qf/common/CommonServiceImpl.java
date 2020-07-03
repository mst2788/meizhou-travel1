package com.qf.common;

import java.util.List;

public abstract class CommonServiceImpl<T> implements CommonService<T> {

    public abstract CommonMapper<T> commonMapper();

    public List<T> selectAll(){
        return commonMapper().selectAll();
    }

    public int deleteByPrimaryKey(Long id) {
        return commonMapper().deleteByPrimaryKey(id);
    }

    public int insert(T record) {
        return commonMapper().insert(record);
    }

    public int insertSelective(T record) {
        return commonMapper().insertSelective(record);
    }

    public T selectByPrimaryKey(Long id) {
        return commonMapper().selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(T record) {
        return commonMapper().updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(T record) {
        return commonMapper().updateByPrimaryKey(record);
    }
}
