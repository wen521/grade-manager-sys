package com.lc.studentmanager.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @Classname score
 * @Description 成绩实体表
 * @Date 2019/7/3 10:22
 * @Created by lc
 */
@Data
@Entity(name = "s_score")
public class Score {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    private Integer studentId;
    private Integer courseId;
    private double score;
    private String remark;

    //关联表
    private String courseName;
    private String studentName;

}
