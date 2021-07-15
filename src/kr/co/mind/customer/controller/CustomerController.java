package kr.co.mind.customer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.mind.customer.dto.CustomerDto;
import kr.co.mind.customer.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value ="/add", method=RequestMethod.POST)
	public String addCustomer(@ModelAttribute @Valid CustomerDto customerDto, BindingResult bindingResult) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(bindingResult.hasErrors()) {
			//dto 설정된 메세지 값
			message = bindingResult.getFieldError().getDefaultMessage();
		} else {
			//정상 데이터
			customerService.addCustomer(customerDto);
		}
		return message;
	}
	
	@RequestMapping(value ="/modify", method=RequestMethod.POST)
	public String modifyCustomer(@ModelAttribute @Valid CustomerDto customerDto, BindingResult bindingResult) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(bindingResult.hasErrors()) {
			//dto 설정된 메세지 값
			message = bindingResult.getFieldError().getDefaultMessage();
		} else {
			//정상 데이터
			customerService.modifyCustomer(customerDto);
		}
		return message;
	}
	
	@RequestMapping(value ="/remove", method=RequestMethod.POST)
	public String removeCustomer(@RequestParam List<Long> ids) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(ids != null && ids.size() <= 0) {
			//dto 설정된 메세지 값
			message = "customer가 선택되지 않았습니다.";
		} else {
			//정상 데이터
			customerService.removeCustomer(ids);
		}
		return message;
	}
	
	@RequestMapping(value ="/get", method=RequestMethod.POST)
	public String getCustomer(@RequestParam Long id) {
		String message = "";
		
		//Model 데이터가 잘못 들어왔을경우 처리
		if(id != null && id <= 0) {
			//dto 설정된 메세지 값
			message = "customer가 선택되지 않았습니다.";
		} else {
			//정상 데이터
			customerService.getCustomer(id);
		}
		return message;
	}
}
