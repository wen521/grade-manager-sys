package com.lc.studentmanager.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Classname Course
 * @Description None
 * @Date 2019/6/29 20:06
 * @Created by lc
 */
@Data
@Entity(name = "s_course")
public class Course {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    private String name;
    private int teacherId;
    private String courseDate;
    private int selectedNum = 0;//已选人数
    private int maxNum = 50;//课程最大选课人数
    private String info;

}
