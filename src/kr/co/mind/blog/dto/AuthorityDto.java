/**
 * 
 */
package kr.co.mind.blog.dto;

import kr.co.mind.fc.PersistableObject;

/**
 * @author innofactory
 *
 */
public class AuthorityDto extends PersistableObject{

	private String profileId;

	/**
	 * @return the profileId
	 */
	public String getProfileId() {
		return profileId;
	}

	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	
	
	
}
