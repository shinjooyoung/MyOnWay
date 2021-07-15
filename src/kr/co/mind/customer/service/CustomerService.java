/**
 * 
 */
package kr.co.mind.customer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.mind.customer.dto.CustomerDto;

/**
 * @author innofactory
 *
 */
public interface CustomerService {
	
	boolean addCustomer(CustomerDto customerDto);
	
	boolean modifyCustomer(CustomerDto customerDto);
	
	boolean removeCustomer(List<Long> ids);
	
	CustomerDto getCustomer(Long id);

}
