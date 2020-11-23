package com.lc.studentmanager.service;

import com.lc.studentmanager.domain.Admin;

/**
 * @Classname AdminService
 * @Description None
 * @Date 2019/6/25 11:07
 * @Created by lc
 */
public interface AdminService {

    Admin findByAdmin(Admin admin);


    int editPswdByAdmin(Admin admin);
}
