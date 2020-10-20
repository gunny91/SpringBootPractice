package com.upload.controller;


import java.io.File;
import java.util.UUID;

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
		String savedName= file.getOriginalFilename();
//		File target = new File(uploadPath, saveName);
//		
//		FileCopyUtils.copy(file.getBytes(), target);
//		
//		mav.setViewName("upload/uploadResult");
//		mav.addObject("saveName",saveName);
//		return mav;
		savedName = uploadFile(savedName, file.getBytes());
		
		mav.setViewName("upload/uploadResult");
		mav.addObject("saveName",savedName);
		return mav;
	}
	
	private String uploadFile(String orginalName, byte[] fileData) throws Exception {
		
		UUID uid = UUID.randomUUID();
		String savedName = uid.toString()+"_"+ orginalName;
		
		//new file(directory, filename)
		File target = new File(uploadPath, savedName);
		
		//Move the file to directory that we assigned
		FileCopyUtils.copy(fileData, target);
		return savedName;
	}
}
