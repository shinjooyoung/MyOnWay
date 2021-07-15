/**
 * 
 */
package kr.co.mind.content.dto;

import java.io.File;

import kr.co.mind.fc.PersistableObject;

/**
 * @author innofactory
 *
 */
public class ContentDto extends PersistableObject {
	
	private String name;
	
	private File file;
	
	private Long boardId;

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
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(File file) {
		this.file = file;
	}

	/**
	 * @return the boardId
	 */
	public Long getBoardId() {
		return boardId;
	}

	/**
	 * @param boardId the boardId to set
	 */
	public void setBoardId(Long boardId) {
		this.boardId = boardId;
	}

	

}
