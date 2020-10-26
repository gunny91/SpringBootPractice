package com.ghsoft.dto;

import lombok.Data;
import lombok.ToString;

/**
 * This is class to store the data 
 * @author Geonhee Cho
 *
 */
//@Getter
//@Setter
//@ToString
@Data
@ToString(exclude= {"val2"})
public class SampleDTO {
	
	private String val1;
	private String val2;
	private String val3;
	
	
}
