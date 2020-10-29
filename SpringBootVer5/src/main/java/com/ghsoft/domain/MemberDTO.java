package com.ghsoft.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberDTO {
	

	
	private int mno;
	private String mid;
	private String mpw;
	private String mname;
	private Timestamp regdate;
	
	
	
}
