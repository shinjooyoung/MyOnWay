/**
 * 
 */
package kr.co.mind.board.service;

import java.util.List;

import kr.co.mind.board.dto.BoardDto;

/**
 * @author innofactory
 *
 */
public interface BoardService {
	
	
	boolean addBoard(BoardDto BoardDto);
	
	boolean modifyBoard(BoardDto BoardDto);
	
	boolean removeBoard(List<Long> ids);
	
	BoardDto getBoard(Long id);

}
