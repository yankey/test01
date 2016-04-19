package com.nnoco.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.nnoco.dao.BoardDao;
import com.nnoco.dto.BoardDto;
import com.nnoco.example.HomeController;

 

@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@Autowired
	private BoardDao boardDao;
	/*
	@RequestMapping("/list")
	public String boList(Model model){
		List<BoardDto> list = boardDao.boardList();
		model.addAttribute("list", list);  
		logger.info("/test/list...........");
		return "list";
	}
	@RequestMapping("/write")
	public String boWrite(Model model){
		return "write";
	}
	@RequestMapping("writeUpdate")
	public String boWriteUpdate(BoardDto boardDto){ 
		//Map<String, MultipartFile> files = request.getFileMap();
		//CommonsMultipartFile cmf = (CommonsMultipartFile) files.get("uploadFile");
		//String path ="d:/uploadTest/"+cmf.getOriginalFilename();
		boardDao.boardWrite(boardDto);
		return "redirect:list";
	}  
	
	
	@RequestMapping("/board/page")
	public String boPage(@RequestParam("page") int page, Model model){ 
		List<BoardDto> list = boardDao.boardPage(page);
		model.addAttribute("list", list); 
		logger.info("紐⑸줉 �끂異�............"+page);
		return "board/page";
	}
	@RequestMapping("/board/view")
	public String boView(@RequestParam("bno") int bno, Model model){
		boardDao.boardCount(bno);
		BoardDto view = boardDao.boardView(bno);
		model.addAttribute("view", view);
		return "board/view";
	}
	@RequestMapping("/board/write")
	public String boWrite(Model model){
		return "board/write";
	}
	@RequestMapping("/board/writeUpdate")
	public String boWriteUpdate(BoardDto boardDto){ 
		boardDao.boardWrite(boardDto);
		return "redirect:list";
	}
	@RequestMapping("/board/update")
	public String boUpdate(@RequestParam("bno") int bno, Model model){
		BoardDto boardDto = boardDao.boardView(bno);
		model.addAttribute("edit", boardDto); 
		System.out.println(boardDto.getBno());
		return "board/update";
	}
	@RequestMapping("/board/updateUpdate")
	public String boUpdateUpdate(BoardDto boardDto){
		System.out.println(boardDto.getBno());
		boardDao.boardUpdate(boardDto);
		return "redirect:list";
	}
	@RequestMapping("/board/delete")
	public String boDelete(@RequestParam("bno") int bno){
		boardDao.boardDelete(bno);
		logger.info("�궘�젣 �셿猷�...");
		return "redirect:list";
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView errorModelAndView(Exception ex){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/error_common");
		modelAndView.addObject("exception", ex);
		return modelAndView;
		
	}*/
}
