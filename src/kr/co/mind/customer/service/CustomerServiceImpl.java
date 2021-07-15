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
@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public boolean addCustomer(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyCustomer(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeCustomer(List<Long> ids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CustomerDto getCustomer(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
