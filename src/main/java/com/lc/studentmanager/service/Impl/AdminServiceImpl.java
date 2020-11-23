package com.lc.studentmanager.service.Impl;

import com.lc.studentmanager.domain.Admin;
import com.lc.studentmanager.mapper.AdminMapper;
import com.lc.studentmanager.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname UserServiceImpl
 * @Description None
 * @Date 2019/6/25 11:08
 * @Created by lc
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin findByAdmin(Admin admin) {
        return adminMapper.findByAdmin(admin);
    }

    @Override
    public int editPswdByAdmin(Admin admin) {
        return adminMapper.editPswdByAdmin(admin);
    }

}
