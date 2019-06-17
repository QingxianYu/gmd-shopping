package com.springcloud.dao;

import com.springcloud.entity.Class2;
import java.util.List;

public interface Class2Mapper {
    int deleteByPrimaryKey(Integer class2Id);

    int insert(Class2 record);

    Class2 selectByPrimaryKey(Integer class2Id);

    List<Class2> selectAll();

    int updateByPrimaryKey(Class2 record);
    /**
     * 查询CLASS2表中指定CLASS1ID的耳机类别信息
     * @param Class1Id 一级类别编号
     * @return 成功返回java.util.List类型的实例͵否则返回null
     */
    public abstract List<Class2> selectByClass1Id(Integer class1Id);
}