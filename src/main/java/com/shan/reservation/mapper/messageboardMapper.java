package com.shan.reservation.mapper;

import com.shan.reservation.bean.messageboard;
import com.shan.reservation.bean.messageboardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface messageboardMapper {
    int countByExample(messageboardExample example);

    int deleteByExample(messageboardExample example);

    int deleteByPrimaryKey(Integer messageboardId);

    int insert(messageboard record);

    int insertSelective(messageboard record);

    List<messageboard> selectByExample(messageboardExample example);

    messageboard selectByPrimaryKey(Integer messageboardId);

    int updateByExampleSelective(@Param("record") messageboard record, @Param("example") messageboardExample example);

    int updateByExample(@Param("record") messageboard record, @Param("example") messageboardExample example);

    int updateByPrimaryKeySelective(messageboard record);

    int updateByPrimaryKey(messageboard record);
}