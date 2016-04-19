package com.nnoco.dao;

import java.util.List;
 

import com.nnoco.dto.BoardDto;

 
public interface BoardDao {
	public List<BoardDto> boardList();
	public void boardWrite(BoardDto boardDto);
	//public BoardDto boardView(int bno);
	//public void boardWrite(BoardDto boardDto);
	//public void boardUpdate(BoardDto boardDto);
	//public void boardCount(int bno);
	//public void boardDelete(int bno);
	//public List<BoardDto> boardPage(int page);
 
	
}
