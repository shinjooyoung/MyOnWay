/**
 * 
 */
package kr.co.mind.menu.service;

import java.util.List;

import kr.co.mind.menu.dto.MenuDto;

/**
 * @author innofactory
 *
 */
public interface MenuService {
	
	boolean addMenu(MenuDto menuDto);
	
	boolean modifyMenu(MenuDto menuDto);
	
	boolean removeMenu(List<Long> ids);
	
	MenuDto getMenu(Long id);
	
}
