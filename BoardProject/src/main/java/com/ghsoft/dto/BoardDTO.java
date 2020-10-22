package com.ghsoft.dto;

import java.util.Date;

import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

@Data
public class BoardDTO {

	private int b_no;
    private String b_title;
    private String b_detail;
    private String b_writer;
    private Date b_date;
    private int b_count;
}
