package com.swathi.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Result")
@Data
public class Result {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rno;
	@Column(name = "NameOfTheStudent")
	private String name;
	@Column(name = "Maths")
	private int math;
	@Column(name = "English")
	private int eng;
	@Column(name = "Hindi")
	private int hindi;
	@Column(name = "Science")
	private int science;
	@Column(name = "TotalMarks")
	private int total;
	@Column(name = "AcheivedGrade")
	private String grade;

}
