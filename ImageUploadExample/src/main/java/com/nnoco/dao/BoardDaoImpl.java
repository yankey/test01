package com.nnoco.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nnoco.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<BoardDto> boardList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("board.boardList");
	}
	@Override
	public void boardWrite(BoardDto boardDto) {
		// TODO Auto-generated method stub
		sqlSession.insert("board.boardWrite", boardDto);
	}
	/*@Override
	public List<BoardDto> boardPage(int page) { 
		// TODO Auto-generated method stub 
		return sqlSession.selectList("board.boardPage", page);
	}

	@Override
	public BoardDto boardView(int bno) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("board.boardView", bno);
	}

	@Override
	public void boardWrite(BoardDto boardDto) {
		// TODO Auto-generated method stub
		sqlSession.insert("board.boardWrite", boardDto);
	}

	@Override
	public void boardUpdate(BoardDto boardDto) {
		// TODO Auto-generated method stub
		sqlSession.update("board.boardUpdate", boardDto);
	}

	@Override
	public void boardDelete(int bno) {
		// TODO Auto-generated method stub
		sqlSession.delete("board.boardDelete", bno);
	}
	@Override
	public void boardCount(int bno) {
		// TODO Auto-generated method stub
		sqlSession.update("board.boardCount", bno);
		
	}*/ 

}
