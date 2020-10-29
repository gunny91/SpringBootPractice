package com.ghsoft.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name="tbl_members")
@EqualsAndHashCode(of="uid")
public class Member {
	
	@Id
	private String uid;
	private String upw;
	private String uname;
}
