/**
 * 
 */
package kr.co.mind.profile.dto;

import java.util.List;

import kr.co.mind.blog.dto.BlogDto;
import kr.co.mind.content.dto.ContentDto;
import kr.co.mind.fc.PersistableObject;

/**
 * @author innofactory
 *
 */
public class ProfileDto extends PersistableObject {

	private String name;
	
	private String job;
	
	private String background;
	
	private BlogDto blog;
	
	private Long customerId;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * @return the background
	 */
	public String getBackground() {
		return background;
	}

	/**
	 * @param background the background to set
	 */
	public void setBackground(String background) {
		this.background = background;
	}

	/**
	 * @return the blog
	 */
	public BlogDto getBlog() {
		return blog;
	}

	/**
	 * @param blog the blog to set
	 */
	public void setBlog(BlogDto blog) {
		this.blog = blog;
	}

	/**
	 * @return the customerId
	 */
	public Long getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	
	

}
