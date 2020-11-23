package com.lc.studentmanager.service;

import com.lc.studentmanager.util.PageBean;
import com.lc.studentmanager.domain.Leave;

import java.util.Map;

/**
 * @Classname LeaveService
 * @Description None
 * @Date 2019/7/2 15:54
 * @Created by lc
 */
public interface LeaveService {
    PageBean<Leave> queryPage(Map<String, Object> paramMap);

    int addLeave(Leave leave);

    int editLeave(Leave leave);

    int checkLeave(Leave leave);

    int deleteLeave(Integer id);
}
