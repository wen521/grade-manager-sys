package com.lc.studentmanager.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name="s_student")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	private String sn;//学号
	private String username;
	private String password;
	private int clazzId;
	private String sex = "男";
	private String mobile;
	private String qq;
	private String photo;//头像

}
