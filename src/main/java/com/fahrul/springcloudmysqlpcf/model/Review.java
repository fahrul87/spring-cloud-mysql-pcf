package com.fahrul.springcloudmysqlpcf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MYReview")
@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private int experience;
	private String companyName;
	private String interviewDate;
	private String interviewMode;
	private String jobDescription;
	private String primaryFocus;
	private String appliedFor;
	

}
