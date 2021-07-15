/**
 * 
 */
package kr.co.mind.menu.domain;

import java.sql.Timestamp;

import kr.co.mind.fc.PersistableObject;

/**
 * @author innofactory
 *
 */
public class MenuEntity{
	
	private String name;
	
	private Long blogId;
	
	private Long menuId;

	private Timestamp createDate;
	
	private Timestamp updateDate;
	
	public MenuEntity() {
		// TODO Auto-generated constructor stub
	}

	public MenuEntity(String name, Long blogId, Long menuId, Timestamp createDate, Timestamp updateDate) {
		this.name = name;
		this.blogId = blogId;
		this.menuId = menuId;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	

	
}
