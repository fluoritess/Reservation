package com.shan.reservation.mapper;

import com.shan.reservation.bean.item;
import com.shan.reservation.bean.itemExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface itemMapper {
    int countByExample(itemExample example);

    int deleteByExample(itemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(item record);

    int insertSelective(item record);

    List<item> selectByExample(itemExample example);

    item selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") item record, @Param("example") itemExample example);

    int updateByExample(@Param("record") item record, @Param("example") itemExample example);

    int updateByPrimaryKeySelective(item record);

    int updateByPrimaryKey(item record);
}