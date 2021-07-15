package kr.co.mind.board.dto;

import java.util.List;

import kr.co.mind.content.dto.ContentDto;
import kr.co.mind.fc.PersistableObject;

public class BoardDto extends PersistableObject {

	private String title;
	
	private String text;
	
	private List<ContentDto> contents;
	
	private Long menuId;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the contents
	 */
	public List<ContentDto> getContents() {
		return contents;
	}

	/**
	 * @param contents the contents to set
	 */
	public void setContents(List<ContentDto> contents) {
		this.contents = contents;
	}

	/**
	 * @return the menuId
	 */
	public Long getMenuId() {
		return menuId;
	}

	/**
	 * @param menuId the menuId to set
	 */
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	
	
	
}
