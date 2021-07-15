/**
 * 
 */
package kr.co.mind.content.service;

import java.util.List;

import kr.co.mind.content.dto.ContentDto;

/**
 * @author innofactory
 *
 */
public interface ContentService {
	
	boolean addContent(ContentDto contentDto);
	
	boolean modifyContent(ContentDto contentDto);
	
	boolean removeContent(List<Long> ids);
	
	ContentDto getContent(Long id);

}
