/**
 * 
 */
package kr.co.mind.blog.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mind.blog.domain.BlogEntity;
import kr.co.mind.blog.dto.BlogDto;
import kr.co.mind.mybatis.mapper.BlogMapper;
import kr.co.mind.profile.dto.ProfileDto;

/**
 * @author innofactory
 *
 */
@Service
public class BlogServiceImpl implements BlogService {

	@Override
	public boolean addBlog(BlogDto blogDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyBlog(BlogDto blogDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeBlog(List<Long> ids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BlogDto getBlog(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Autowired
//	BlogMapper blogMapper;
//
//	@Override
//	public boolean addBlog(BlogDto blogDto) {
//		boolean result = false;
//		try {
//			Date date = new Date();
//			Timestamp time = new Timestamp(date.getTime());
//			BlogEntity blogEntiy = new BlogEntity(blogDto.getProfileId(), blogDto.getName(), time, time);
//			int insertResult = blogMapper.insertBlog(blogEntiy);
//			if(insertResult == 1) {
//				result = true;
//			}
//		} catch (Exception e) {
//			System.out.println("err =  " +e.getMessage());
//		}
//		
//		
//		return result;
//	}
//
//	@Override
//	public boolean modifyBlog(BlogDto blogDto) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean removeBlog(List<Long> ids) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public BlogDto getBlog(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	

}
