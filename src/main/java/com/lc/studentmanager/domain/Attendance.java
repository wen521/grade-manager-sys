package com.lc.studentmanager.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Classname Attendance
 * @Description 考勤实体类
 * @Date 2019/7/1 11:52
 * @Created by lc
 */
@Data
@Entity(name = "s_attendance")
public class Attendance {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    private Integer courseId;
    private Integer studentId;
    private String type;
    private String date;

}
