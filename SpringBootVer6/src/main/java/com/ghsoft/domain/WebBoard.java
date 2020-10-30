package com.ghsoft.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity //table
@Table(name="tbl_webboards")
@EqualsAndHashCode(of="bno")
@ToString
public class WebBoard {
	
	/**
	 * primary key
	 */
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long bno;
	
	private String title;
	private String writer;
	private String context;
	
	@CreationTimestamp
	private Timestamp regDate;
	@UpdateTimestamp
	private Timestamp updateDate;
	
	
}
