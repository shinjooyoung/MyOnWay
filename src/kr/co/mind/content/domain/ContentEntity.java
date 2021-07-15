/**
 * 
 */
package kr.co.mind.content.domain;

import java.sql.Timestamp;
import java.util.List;

import kr.co.mind.content.utils.ContentHolder;
import kr.co.mind.fc.PersistableObject;

/**
 * @author innofactory
 *
 */
public class ContentEntity {
	
	private String name;
	
	private String fileName;
	
	private Long parentId;
	
	private Timestamp createDate;
	
	private Timestamp updateDate;

	public ContentEntity() {
		// TODO Auto-generated constructor stub
	}

	public ContentEntity(String name, String fileName, Long parentId, Timestamp createDate,
			Timestamp updateDate) {
		this.name = name;
		this.fileName = fileName;
		this.parentId = parentId;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
}
