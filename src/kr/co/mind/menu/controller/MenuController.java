package kr.co.mind.menu.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.mind.menu.dto.MenuDto;
import kr.co.mind.menu.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	MenuService menuService;
	
	@RequestMapping(value ="/add", method=RequestMethod.POST)
	public String addMenu(@ModelAttribute @Valid MenuDto menuDto, BindingResult bindingResult) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(bindingResult.hasErrors()) {
			//dto 설정된 메세지 값
			message = bindingResult.getFieldError().getDefaultMessage();
		} else {
			//정상 데이터
			menuService.addMenu(menuDto);
		}
		return message;
	}
	
	@RequestMapping(value ="/modify", method=RequestMethod.POST)
	public String modifyMenu(@ModelAttribute @Valid MenuDto menuDto, BindingResult bindingResult) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(bindingResult.hasErrors()) {
			//dto 설정된 메세지 값
			message = bindingResult.getFieldError().getDefaultMessage();
		} else {
			//정상 데이터
			menuService.modifyMenu(menuDto);
		}
		return message;
	}
	
	@RequestMapping(value ="/remove", method=RequestMethod.POST)
	public String removeMenu(@RequestParam List<Long> ids) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(ids != null && ids.size() <= 0) {
			//dto 설정된 메세지 값
			message = "menu가 선택되지 않았습니다.";
		} else {
			//정상 데이터
			menuService.removeMenu(ids);
		}
		return message;
	}
	
	@RequestMapping(value ="/get", method=RequestMethod.POST)
	public String getMenu(@RequestParam Long id) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(id != null && id <= 0) {
			//dto 설정된 메세지 값
			message = "menu가 선택되지 않았습니다.";
		} else {
			//정상 데이터
			menuService.getMenu(id);
		}
		return message;
	}

}
