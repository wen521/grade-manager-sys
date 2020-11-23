package com.lc.studentmanager.service;

import com.lc.studentmanager.util.PageBean;
import com.lc.studentmanager.domain.Clazz;

import java.util.List;
import java.util.Map;

/**
 * @Classname ClazzService
 * @Description None
 * @Date 2019/6/26 10:14
 * @Created by lc
 */
public interface ClazzService {
    PageBean<Clazz> queryPage(Map<String, Object> paramMap);

    int addClazz(Clazz clazz);

    int deleteClazz(List<Integer> ids);

    int editClazz(Clazz clazz);

    Clazz findByName(String clazzName);

}
