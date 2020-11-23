package com.lc.studentmanager.service;

import com.lc.studentmanager.util.PageBean;
import com.lc.studentmanager.domain.Course;

import java.util.List;
import java.util.Map;

/**
 * @Classname CourseService
 * @Description None
 * @Date 2019/6/29 20:09
 * @Created by lc
 */
public interface CourseService {
    PageBean<Course> queryPage(Map<String, Object> paramMap);

    int addCourse(Course course);

    int editCourse(Course course);

    int deleteCourse(List<Integer> ids);

    List<Course> getCourseById(List<Integer> ids);

    int findByName(String name);
}
