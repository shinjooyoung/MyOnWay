/**
 * 
 */
package kr.co.mind.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.mind.profile.domain.ProfileEntity;

/**
 * @author innofactory
 *
 */

public interface ProfileMapper {
	
	int insertProfile(ProfileEntity profile);
	
	int updateProfile(ProfileEntity profile);
	
	int deleteProfile(List<Long> ids);
	
	List<ProfileEntity> selectProfile(Long ids);

}
