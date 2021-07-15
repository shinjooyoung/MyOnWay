/**
 * 
 */
package kr.co.mind.blog.domain;

import java.sql.Timestamp;

/**
 * @author innofactory
 *
 */
public class BlogAuthEntity{

	private Long id;
	
	private boolean auth;
	
	private Long profileId;
	
	private Timestamp createDate;
	
	private Timestamp updateDate;
	
	
	public BlogAuthEntity() {
		
	}

	public BlogAuthEntity(Long id, boolean auth, Long profileId, Timestamp createDate, Timestamp updateDate) {
		this.id = id;
		this.auth = auth;
		this.profileId = profileId;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	
}
