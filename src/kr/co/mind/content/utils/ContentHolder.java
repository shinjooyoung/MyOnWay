package kr.co.mind.content.utils;

import java.io.File;

public interface ContentHolder {
	
	void setContent(File file);
	
	File getContent(Long id);
	
	boolean removeContent(Long id);
	
	boolean updateContent(Long id);
}
