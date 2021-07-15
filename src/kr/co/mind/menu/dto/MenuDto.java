/**
 * 
 */
package kr.co.mind.menu.dto;

import java.util.List;

import kr.co.mind.board.dto.BoardDto;
import kr.co.mind.fc.PersistableObject;

/**
 * @author innofactory
 *
 */
public class MenuDto extends PersistableObject {

	private String name;
	
	private List<BoardDto> boards;
	
	private List<MenuDto> menus;
	
	private Long menuId;
	
	private Long blogId;

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
	 * @return the boards
	 */
	public List<BoardDto> getBoards() {
		return boards;
	}

	/**
	 * @param boards the boards to set
	 */
	public void setBoards(List<BoardDto> boards) {
		this.boards = boards;
	}

	/**
	 * @return the menus
	 */
	public List<MenuDto> getMenus() {
		return menus;
	}

	/**
	 * @param menus the menus to set
	 */
	public void setMenus(List<MenuDto> menus) {
		this.menus = menus;
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

	/**
	 * @return the blogId
	 */
	public Long getBlogId() {
		return blogId;
	}

	/**
	 * @param blogId the blogId to set
	 */
	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}
	
	
	
}
