package com.lc.studentmanager.mapper;

import com.lc.studentmanager.domain.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Classname CourseMapper
 * @Description None
 * @Date 2019/6/29 20:34
 * @Created by lc
 */
@Mapper
public interface CourseMapper {
    List<Course> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addCourse(Course course);

    int editCourse(Course course);

    int deleteCourse(List<Integer> ids);

    int addStudentNum(Integer courseId);

    void deleteStudentNum(Integer courseId);

    List<Course> getCourseById(List<Integer> ids);

    int findByName(String name);
}
