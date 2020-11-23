package com.lc.studentmanager.mapper;

import com.lc.studentmanager.domain.Leave;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Classname LeaveMapper
 * @Description None
 * @Date 2019/7/2 15:55
 * @Created by lc
 */
@Mapper
public interface LeaveMapper {
    List<Leave> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addLeave(Leave leave);

    int editLeave(Leave leave);

    int checkLeave(Leave leave);

    int deleteLeave(Integer id);
}
