package org.zerock.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getList() {
		log.info("get List..........");
		return mapper.getList();
	}
	@Override
	public List<BoardVO> get() {
		log.info("get List..........");
		return mapper.get();
	}
}
