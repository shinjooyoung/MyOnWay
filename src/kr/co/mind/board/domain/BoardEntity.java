package kr.co.mind.board.domain;

import java.sql.Timestamp;

public class BoardEntity {
	
	private String title;
	
	private String text;
	
	private Long parentId;
	
	private Timestamp createDate;
	
	private Timestamp updateDate;

	public BoardEntity() {
		// TODO Auto-generated constructor stub
	}

	public BoardEntity(String title, String text, Long parentId, Timestamp createDate, Timestamp updateDate) {
		this.title = title;
		this.text = text;
		this.parentId = parentId;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	

	
}
