/**
 * 
 */
package kr.co.mind.blog.domain;

import java.sql.Timestamp;

/**
 * @author innofactory
 *
 */
public class BlogEntity{
	
	private Long profileId;
	
	private String name;
	
	private Timestamp createDate;
	
	private Timestamp updateDate;
	
	public BlogEntity() {
		
	}
	
	public BlogEntity(Long profileId, String name) {
		this.profileId = profileId;
		this.name = name;
	}

	public BlogEntity(Long profileId, String name, Timestamp createDate, Timestamp updateDate) {
		this.profileId = profileId;
		this.name = name;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	
}
