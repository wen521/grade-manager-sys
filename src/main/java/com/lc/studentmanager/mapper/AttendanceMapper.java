package com.lc.studentmanager.mapper;

import com.lc.studentmanager.domain.Attendance;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Classname AttendanceMapper
 * @Description None
 * @Date 2019/7/1 15:49
 * @Created by lc
 */
@Mapper
public interface AttendanceMapper {
    List<Attendance> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addAtendance(Attendance attendance);

    Attendance isAttendance(Attendance attendance);

    int deleteAttendance(Integer id);
}
