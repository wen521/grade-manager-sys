package com.lc.studentmanager.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 用户实体类
 */
@Data
@Entity(name = "s_admin")
public class Admin {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	private String username;
	private String password;
}
