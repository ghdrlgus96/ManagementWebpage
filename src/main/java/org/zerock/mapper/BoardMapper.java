package org.zerock.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface BoardMapper {
	//@Select("select * from tbl_test")
	public List<BoardVO> getList();
	public List<BoardVO> get();
}
