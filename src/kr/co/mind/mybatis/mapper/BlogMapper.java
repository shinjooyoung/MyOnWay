/**
 * 
 */
package kr.co.mind.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.mind.blog.domain.BlogAuthEntity;
import kr.co.mind.blog.domain.BlogEntity;

/**
 * @author innofactory
 *
 */

public interface BlogMapper {
	
	int insertBlog(BlogEntity blog);
	
	int updateBlog(BlogEntity blog);
	
	int deleteBlog(List<Long> ids);
	
	List<BlogEntity> selectBlog(Long ids);
	
	int insertBlogAuth(BlogAuthEntity auth);

}
