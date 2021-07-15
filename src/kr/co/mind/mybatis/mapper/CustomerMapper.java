/**
 * 
 */
package kr.co.mind.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.mind.customer.domain.CustomerEntity;

/**
 * @author innofactory
 *
 */

public interface CustomerMapper {
	
	int insertCustomer(CustomerEntity customer);
	
	int updateCustomer(CustomerEntity customer);
	
	int deleteCustomer(List<Long> ids);
	
	List<CustomerEntity> selectCustomer(Long ids);


}
