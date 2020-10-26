package com.ghsoft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ghsoft.dto.SampleDTO;


/**
 * 결과 화면은 JSP나 HTML같은 별도의 뷰(View)를 활용하지 않고 문자열 데이터를 브라우저로 전송한다.
 * This is using RestController to use test for several GetMapping ...
 * @author Geonhee Cho
 *
 */
@RestController
public class SampleController {
	
	@GetMapping("/hello")
	public String sysHello() {
		
		return "hello world!";
	}
	
	@GetMapping("sample")
	public SampleDTO makeSample() {
		SampleDTO temp = new SampleDTO();
		
		temp.setVal1("First");
		temp.setVal2("Second");
		temp.setVal3("Third");
		System.out.println(temp);
		return temp;
	}
	
}
