package kr.co.mind.fc;

import java.util.Date;

import org.springframework.validation.annotation.Validated;

import com.sun.istack.internal.NotNull;

@Validated
public abstract class PersistableObject implements Persistable{

	protected Date createDate;
	
	protected Date updateDate;
	
	@NotNull
	protected Long id;
	
	@Override
	public Date getCreateDate() {
		return this.createDate;
	}
	
	@Override
	public void setCreateDate(Date date) {
		this.createDate = date;
	}
	
	
	@Override
	public Long getId() {
		return this.id;
	}
	
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Date getUpdateDate() {
		return this.updateDate;
	}
	
	@Override
	public void setUpdateDate(Date date) {
		this.updateDate = date;
	}
	

	
	
}
