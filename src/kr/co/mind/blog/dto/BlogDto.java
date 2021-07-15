/**
 * 
 */
package kr.co.mind.blog.dto;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;


import kr.co.mind.fc.PersistableObject;
import kr.co.mind.menu.dto.MenuDto;

/**
 * @author innofactory
 *
 */
@Validated
public class BlogDto extends PersistableObject{
	
	@NotNull
	@Max(value=30, message="30 자를 초과하셨습니다.")
	@Min(value=1, message="1글자 이상 입력 가능합니다.")
	private String name;
	
	
	private List<MenuDto> menus;
	
	private List<AuthorityDto> auths;
	
	@NotNull
	private Long profileId;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**a
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the menus
	 */
	public List<MenuDto> getMenus() {
		return menus;
	}

	/**
	 * @param menus the menus to set
	 */
	public void setMenus(List<MenuDto> menus) {
		this.menus = menus;
	}

	/**
	 * @return the auths
	 */
	public List<AuthorityDto> getAuths() {
		return auths;
	}

	/**
	 * @param auths the auths to set
	 */
	public void setAuths(List<AuthorityDto> auths) {
		this.auths = auths;
	}

	/**
	 * @return the profileId
	 */
	public Long getProfileId() {
		return profileId;
	}

	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}
	
	
	
	
}
