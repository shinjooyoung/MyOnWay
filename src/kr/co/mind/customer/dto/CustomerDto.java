/**
 * 
 */
package kr.co.mind.customer.dto;

import java.util.List;

import kr.co.mind.fc.PersistableObject;
import kr.co.mind.profile.dto.ProfileDto;

/**
 * @author innofactory
 *
 */
public class CustomerDto extends PersistableObject {
	
	private String userId;

	private String password;
	
	private String name;
	
	private String phone;
	
	private String email;
	
	private List<ProfileDto> profiles;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the profiles
	 */
	public List<ProfileDto> getProfiles() {
		return profiles;
	}

	/**
	 * @param profiles the profiles to set
	 */
	public void setProfiles(List<ProfileDto> profiles) {
		this.profiles = profiles;
	}
	
	
	
}
