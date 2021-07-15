/**
 * 
 */
package kr.co.mind.customer.domain;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import kr.co.mind.profile.domain.ProfileEntity;

/**
 * @author innofactory
 *
 */
public class CustomerEntity {

	private String userId;
	
	private String password;
	
	private String name;
	
	private String phone;
	
	private String email;
	
	private Timestamp createDate;
	
	private Timestamp updateDate;
	
	public CustomerEntity() {
		// TODO Auto-generated constructor stub
	}

	public CustomerEntity(String userId, String password, String name, String phone, String email,
			Timestamp createDate, Timestamp updateDate) {
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
}
