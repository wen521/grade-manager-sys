package com.lc.studentmanager.service;

import com.lc.studentmanager.domain.Attendance;
import com.lc.studentmanager.util.PageBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @Classname AttendanceService
 * @Description None
 * @Date 2019/7/1 15:47
 * @Created by lc
 */
public interface AttendanceService {
    PageBean<Attendance> queryPage(Map<String, Object> paramMap);

    boolean isAttendance(Attendance attendance);

    int addAtendance(Attendance attendance);

    int deleteAttendance(Integer id);
}
