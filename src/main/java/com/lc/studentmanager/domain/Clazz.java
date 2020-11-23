package com.lc.studentmanager.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 班级实体类
 */
@Data
@Entity(name = "s_clazz")
public class Clazz {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	private String name;
	private String info;

}
