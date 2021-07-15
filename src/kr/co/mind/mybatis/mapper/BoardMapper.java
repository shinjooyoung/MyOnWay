/**
 * 
 */
package kr.co.mind.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.mind.board.domain.BoardEntity;

/**
 * @author innofactory
 *
 */

public interface BoardMapper {
	
	int insertBoard(BoardEntity board);
	
	int updateBoard(BoardEntity board);
	
	int deleteBoard(List<Long> ids);
	
	List<BoardEntity> selectBoard(Long ids);


}
