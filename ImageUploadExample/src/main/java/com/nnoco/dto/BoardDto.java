package com.nnoco.dto;

import java.util.Date;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class BoardDto { 
	public String name;
	public String content;    
	public String fileData;
 

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name:"+name+",content:"+content;
	}
	 
	public String getFileData() {
		return fileData;
	}

	public void setFileData(String fileData) {
		this.fileData = fileData;
	}

	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	}  
	public String getContent() {
		return content;
	} 
	public void setContent(String content) {
		this.content = content;
	}
}
