package com.java.code.study.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Department {

	private Integer id;
	private String departmentName;

	public Department() {
	}
}
