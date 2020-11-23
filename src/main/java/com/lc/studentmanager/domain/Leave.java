package com.lc.studentmanager.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Classname Leave
 * @Description 请假表实体类
 * @Date 2019/7/2 13:57
 * @Created by lc
 */
@Data
@Entity(name = "s_leave")
public class Leave {
    public static int LEAVE_STATUS_WAIT = 0;//等待审核
    public static int LEAVE_STATUS_AGREE = 1;//同意
    public static int LEAVE_STATUS_DISAGREE = -1;//不同意
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    private int studentId;
    private String info;//请假理由
    private int status = LEAVE_STATUS_WAIT;//请假条状态
    private String remark;//批复内容

}
