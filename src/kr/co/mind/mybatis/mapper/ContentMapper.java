/**
 * 
 */
package kr.co.mind.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.mind.content.domain.ContentEntity;

/**
 * @author innofactory
 *
 */

public interface ContentMapper {
	
	int insertContent(ContentEntity content);
	
	int updateContent(ContentEntity content);
	
	int deleteContent(List<Long> ids);
	
	List<ContentEntity> selectContent(Long ids);

}
