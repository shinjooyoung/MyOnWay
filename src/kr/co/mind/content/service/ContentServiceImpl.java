/**
 * 
 */
package kr.co.mind.content.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.mind.content.dto.ContentDto;

/**
 * @author innofactory
 *
 */
@Service
public class ContentServiceImpl implements ContentService {

	@Override
	public boolean addContent(ContentDto contentDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyContent(ContentDto contentDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeContent(List<Long> ids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ContentDto getContent(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
