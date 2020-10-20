package com.upload.controller;


import java.io.File;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {

	private static final Logger logger = LoggerFactory.getLogger(UploadController.class);
	
	@Resource(name ="uploadPath")
	private String uploadPath;
	
	
	@RequestMapping(value="/upload/uploadForm", method=RequestMethod.GET)
	public void uploadForm() {
		
	}
	
//	@RequestMapping(value="/upload/uploadForm", method=RequestMethod.GET)
//	public String uploadForm() {
//		return "upload/uploadForm";
//	}
	
	@RequestMapping(value="/upload/uploadForm",method=RequestMethod.POST)
	public ModelAndView uploadForm(MultipartFile file, ModelAndView mav) throws Exception{
		String saveName= file.getOriginalFilename();
		File target = new File(uploadPath, saveName);
		
		FileCopyUtils.copy(file.getBytes(), target);
		
		mav.setViewName("upload/uploadResult");
		mav.addObject("saveName",saveName);
		return mav;
	}
}
