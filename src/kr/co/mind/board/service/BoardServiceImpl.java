/**
 * 
 */
package kr.co.mind.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.mind.board.dto.BoardDto;

/**
 * @author innofactory
 *
 */
@Service
public class BoardServiceImpl implements BoardService {

	@Override
	public boolean addBoard(BoardDto BoardDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyBoard(BoardDto BoardDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeBoard(List<Long> ids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BoardDto getBoard(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
