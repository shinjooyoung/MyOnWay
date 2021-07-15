/**
 * 
 */
package kr.co.mind.profile.domain;

import java.sql.Timestamp;

/**
 * @author innofactory
 *
 */
public class ProfileEntity {

	private String name;
	
	private String job;
	
	private String background;
	
	private Long userId;
	
	private Timestamp createDate;
	
	private Timestamp updateDate;
	
	public ProfileEntity() {
		// TODO Auto-generated constructor stub
	}

	public ProfileEntity(String name, String job, String background, Long userId, Timestamp createDate,
			Timestamp updateDate) {
		this.name = name;
		this.job = job;
		this.background = background;
		this.userId = userId;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
}
