/**
 * 
 */
package kr.co.mind.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.mind.menu.domain.MenuEntity;

/**
 * @author innofactory
 *
 */

public interface MenuMapper {
	
	int insertMenu(MenuEntity menu);
	
	int updateMenu(MenuEntity menu);
	
	int deleteMenu(List<Long> ids);
	
	List<MenuEntity> selectMenu(Long ids);

}
