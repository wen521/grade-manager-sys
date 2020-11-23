package com.lc.studentmanager.service.Impl;

import com.lc.studentmanager.util.PageBean;
import com.lc.studentmanager.domain.Leave;
import com.lc.studentmanager.mapper.LeaveMapper;
import com.lc.studentmanager.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Classname LeaveServiceImpl
 * @Description None
 * @Date 2019/7/2 15:54
 * @Created by lc
 */
@Service
public class LeaveServiceImpl implements LeaveService {

    @Autowired
    private LeaveMapper leaveMapper;

    @Override
    public PageBean<Leave> queryPage(Map<String, Object> paramMap) {
        PageBean<Leave> pageBean = new PageBean<>((Integer) paramMap.get("pageno"),(Integer) paramMap.get("pagesize"));

        Integer startIndex = pageBean.getStartIndex();
        paramMap.put("startIndex",startIndex);
        List<Leave> datas = leaveMapper.queryList(paramMap);
        pageBean.setDatas(datas);

        Integer totalsize = leaveMapper.queryCount(paramMap);
        pageBean.setTotalsize(totalsize);
        return pageBean;
    }

    @Override
    public int addLeave(Leave leave) {
        return leaveMapper.addLeave(leave);
    }

    @Override
    public int editLeave(Leave leave) {
        return leaveMapper.editLeave(leave);
    }

    @Override
    public int checkLeave(Leave leave) {
        return leaveMapper.checkLeave(leave);
    }

    @Override
    public int deleteLeave(Integer id) {
        return leaveMapper.deleteLeave(id);
    }
}
