package com.lc.studentmanager.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Classname SelectedCourse
 * @Description 选课信息实体类
 * @Date 2019/6/30 10:30
 * @Created by lc
 */
@Data
@Entity(name = "s_selected_course")
public class SelectedCourse {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    private Integer studentId;
    private Integer courseId;


}
