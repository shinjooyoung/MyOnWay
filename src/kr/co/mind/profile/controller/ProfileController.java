package kr.co.mind.profile.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.mind.profile.dto.ProfileDto;
import kr.co.mind.profile.service.ProfileService;

@Controller
@RequestMapping("/profile")
public class ProfileController {
	
	@Autowired
	ProfileService profileService;
	
	@RequestMapping(value ="/add", method=RequestMethod.POST)
	public String addProfile(@ModelAttribute @Valid ProfileDto profileDto, BindingResult bindingResult) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(bindingResult.hasErrors()) {
			//dto 설정된 메세지 값
			message = bindingResult.getFieldError().getDefaultMessage();
		} else {
			//정상 데이터
			profileService.addProfile(profileDto);
		}
		return message;
	}
	
	@RequestMapping(value ="/modify", method=RequestMethod.POST)
	public String modifyProfile(@ModelAttribute @Valid ProfileDto profileDto, BindingResult bindingResult) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(bindingResult.hasErrors()) {
			//dto 설정된 메세지 값
			message = bindingResult.getFieldError().getDefaultMessage();
		} else {
			//정상 데이터
			profileService.modifyProfile(profileDto);
		}
		return message;
	}
	
	@RequestMapping(value ="/remove", method=RequestMethod.POST)
	public String removeProfile(@RequestParam List<Long> ids) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(ids != null && ids.size() <= 0) {
			//dto 설정된 메세지 값
			message = "profile가 선택되지 않았습니다.";
		} else {
			//정상 데이터
			profileService.removeProfile(ids);
		}
		return message;
	}
	
	@RequestMapping(value ="/get", method=RequestMethod.POST)
	public String getProfile(@RequestParam Long id) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(id != null && id <= 0) {
			//dto 설정된 메세지 값
			message = "profile가 선택되지 않았습니다.";
		} else {
			//정상 데이터
			profileService.getProfile(id);
		}
		return message;
	}

}
