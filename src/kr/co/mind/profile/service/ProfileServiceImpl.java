/**
 * 
 */
package kr.co.mind.profile.service;

import java.util.List;

import javax.xml.ws.WebServiceClient;

import org.springframework.stereotype.Service;

import kr.co.mind.profile.dto.ProfileDto;

/**
 * @author innofactory
 *
 */
@Service
public class ProfileServiceImpl implements ProfileService {

	@Override
	public boolean addProfile(ProfileDto profileDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyProfile(ProfileDto profileDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeProfile(List<Long> ids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProfileDto getProfile(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
