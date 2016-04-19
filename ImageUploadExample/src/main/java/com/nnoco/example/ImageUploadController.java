package com.nnoco.example;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.nnoco.dao.BoardDao;
import com.nnoco.dto.BoardDto;

@Controller
public class ImageUploadController {
	@Resource(name="imageView") ImageView imageView;
	@Autowired ImageService imageService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	 
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping(value="/list")
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
	
	/*@RequestMapping("/write")
	private String uploadView() {
		return "write";
	}*/
	 
	@RequestMapping(value="/complete", method=RequestMethod.POST)
	private String upload(@RequestParam MultipartFile imageFile, BoardDto boardDto, ModelMap modelMap, Model model) {
		//BoardDto boardDto,  boardDao.boardWrite(boardDto);
		ImageFile fileInfo = imageService.save(imageFile);
		modelMap.put("imageFile", fileInfo); 
		//boardDto.setImageFile(fileInfo.getFileName());
		boardDto.setFileData(fileInfo.getId());
		logger.info(boardDto.getName());
		logger.info(boardDto.getContent());
		logger.info(boardDto.getFileData());
		
		model.addAttribute("view", boardDto);
		//logger.info(boardDto);
		boardDao.boardWrite(boardDto);
		return "complete";
	}
	
	@RequestMapping("/image/{imageId}")
	private ImageView getImage(@PathVariable String imageId, ModelMap modelMap) {
		ImageFile imageFile = imageService.get(imageId);
		
		modelMap.put("imageFile", imageFile);
		
		return imageView;
	}
}
