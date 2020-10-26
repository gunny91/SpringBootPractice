package com.ghsoft.dto;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

/**
 * Entity Class 
 * Create JPA Entity Class
 * 1. Make it as Object Oriented
 * 2. @id, @colum etc... Adding the condition or setup
 * 3. Set the relation between entity.
 * I will make mysql table with BoardDTO instance variables
 * Need to put @Entity at the Class  It sets the class as Entity
 * 
 * @Table should have the name as DB's table name. If you want to generate the different table name, Can use @Table(name="something")
 * @author Geonhee Cho
 *
 */
@Data
@Entity
@Table(name="tbl_board")
public class BoardDTO {

	
	/**
	 * Board Number instance variable. It will be primary key
	 * 
	 * 	@Id Important annotation that identify with Primary key!!!!!
	 * 	@GeneratedValue(strategy=GenerationType.AUTO) Id is using with @GeneratedValue to notify what we will use for
	 * 	Two attiribute are usable strategy & generator
	 * 		Strategy --> AUTO		: Automatically generate with certain database
	 * 					 IDENTITY	: Usable at Mysql DB
	 * 					 SEQUENCE	: Usable at Oracle DB
	 * 					 TABLE		: Make Keys 채번 테이블?, the table which generate the numbers
	 * 		Generator--> @Tablegenerator, @SequenceGenerator
	 */
	@Id // Set the PK(Primary key)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long bno;
	
	/**
	 *  Title instance variable
	 */
	private String title;
	
	/**
	 * Writer instance variable
	 */
	private String writer;
	
	/**
	 * Content instance variable
	 */
	private String content;
	
	/**
	 * Board registered date instance variable @CreationTimestamp --> Time realted annotation as Hibernate 
	 */
	@CreationTimestamp
	private Timestamp regdate;
	
	/**
	 * Board revision date instance variable
	 */
	@UpdateTimestamp
	private Timestamp updatedate;
	
	
	
	
	
}
