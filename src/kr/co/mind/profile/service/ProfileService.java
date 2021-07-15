/**
 * 
 */
package kr.co.mind.profile.service;

import java.util.List;

import kr.co.mind.profile.dto.ProfileDto;

/**
 * @author innofactory
 *
 */
public interface ProfileService {
	
	boolean addProfile(ProfileDto profileDto);
	
	boolean modifyProfile(ProfileDto profileDto);
	
	boolean removeProfile(List<Long> ids);
	
	ProfileDto getProfile(Long id);

}
