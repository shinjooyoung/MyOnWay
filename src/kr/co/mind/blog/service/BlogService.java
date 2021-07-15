/**
 * 
 */
package kr.co.mind.blog.service;

import java.util.List;

import kr.co.mind.blog.dto.BlogDto;

/**
 * @author innofactory
 *
 */

public interface BlogService {
	
	boolean addBlog(BlogDto blogDto);
	
	boolean modifyBlog(BlogDto blogDto);
	
	boolean removeBlog(List<Long> ids);
	
	BlogDto getBlog(Long id);

}
