package kr.co.mind.board.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.mind.board.dto.BoardDto;
import kr.co.mind.board.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value ="/add", method=RequestMethod.POST)
	public String addBoard(@ModelAttribute @Valid BoardDto boardDto, BindingResult bindingResult) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(bindingResult.hasErrors()) {
			//dto 설정된 메세지 값
			message = bindingResult.getFieldError().getDefaultMessage();
		} else {
			//정상 데이터
			boardService.addBoard(boardDto);
		}
		return message;
	}
	
	@RequestMapping(value ="/modify", method=RequestMethod.POST)
	public String modifyBoard(@ModelAttribute @Valid BoardDto boardDto, BindingResult bindingResult) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(bindingResult.hasErrors()) {
			//dto 설정된 메세지 값
			message = bindingResult.getFieldError().getDefaultMessage();
		} else {
			//정상 데이터
			boardService.modifyBoard(boardDto);
		}
		return message;
	}
	
	@RequestMapping(value ="/remove", method=RequestMethod.POST)
	public String removeBoard(@RequestParam List<Long> ids) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(ids != null && ids.size() <= 0) {
			//dto 설정된 메세지 값
			message = "board가 선택되지 않았습니다.";
		} else {
			//정상 데이터
			boardService.removeBoard(ids);
		}
		return message;
	}
	
	@RequestMapping(value ="/get", method=RequestMethod.POST)
	public String getBoard(@RequestParam Long id) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(id != null && id <= 0) {
			//dto 설정된 메세지 값
			message = "board가 선택되지 않았습니다.";
		} else {
			//정상 데이터
			boardService.getBoard(id);
		}
		return message;
	}
}
