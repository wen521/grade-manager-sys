package com.lc.studentmanager.domain;

import lombok.Data;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Data
@Entity(name = "s_score")
public class Grade {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	private String name;
	private String remark;


}
