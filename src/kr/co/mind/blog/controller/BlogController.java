package kr.co.mind.blog.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.mind.blog.dto.BlogDto;
import kr.co.mind.blog.service.BlogService;
import kr.co.mind.profile.dto.ProfileDto;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@Autowired
	BlogService blogService;
	
	@RequestMapping(value ="/add", method=RequestMethod.POST)
	public String addBlog(@ModelAttribute @Valid BlogDto blogDto, BindingResult bindingResult) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(bindingResult.hasErrors()) {
			//dto 설정된 메세지 값
			message = bindingResult.getFieldError().getDefaultMessage();
		} else {
			//정상 데이터
//			blogService.addBlog(blogDto);
			message = "success";
		}
		return message;
	}
	
	@RequestMapping(value ="/modify", method=RequestMethod.POST)
	public String modifyBlog(@ModelAttribute @Valid BlogDto blogDto, BindingResult bindingResult) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(bindingResult.hasErrors()) {
			//dto 설정된 메세지 값
			message = bindingResult.getFieldError().getDefaultMessage();
		} else {
			//정상 데이터
			blogService.modifyBlog(blogDto);
		}
		return message;
	}
	
	@RequestMapping(value ="/remove", method=RequestMethod.POST)
	public String removeBlog(@RequestParam("id") List<Long> ids) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(ids != null && ids.size() <= 0) {
			//dto 설정된 메세지 값
			message = "blog가 선택되지 않았습니다.";
		} else {
			//정상 데이터
			blogService.removeBlog(ids);
		}
		return message;
	}
	
	@RequestMapping(value ="/get", method=RequestMethod.POST)
	public String getBlog(@RequestParam("id") Long id) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(id != null && id <= 0) {
			//dto 설정된 메세지 값
			message = "blog가 선택되지 않았습니다.";
		} else {
			//정상 데이터
			blogService.getBlog(id);
		}
		return message;
	}
	
	@RequestMapping(value ="/test", method=RequestMethod.GET)
	public String getTest(@RequestParam("id") String dd) {

		return dd;
	}
}
