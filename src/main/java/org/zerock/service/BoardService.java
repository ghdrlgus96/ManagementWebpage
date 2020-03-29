package org.zerock.service;

import java.util.List;
import org.zerock.domain.BoardVO;

public interface BoardService {
	public List<BoardVO> getList();
	public List<BoardVO> get();
}
