/**
 * 
 */
package kr.co.mind.fc;

import java.util.Date;

/**
 * @author jshin 
 * 
 */
public interface Persistable {
	
	/**
	 * @author jshin 
	 * 
	 */
	Long getId();
	void setId(Long id);
	
	/**
	 * @author jshin 
	 * 
	 */
	Date getCreateDate();
	void setCreateDate(Date date);
	
	/**
	 * @author jshin 
	 * 
	 */
	Date getUpdateDate();
	void setUpdateDate(Date date);
	
	
	
	
}
