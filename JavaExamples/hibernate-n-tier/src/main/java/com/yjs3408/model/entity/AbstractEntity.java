package com.yjs3408.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity implements GenericEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "created_date_time", nullable = false)
	private Date createdDateTime;
	
	@Column(name = "updated_date_time")
	private Date updatedDateTime;
	
	@Column(name = "deleted_date_time")
	private Date deletedDateTime;

	@Override
	public long getId() {
		return id;
	}

	@Override
	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	@Override
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	@Override
	public Date getUpdatedDateTime() {
		return updatedDateTime;
	}

	@Override
	public void setUpdatedDateTime(Date updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	@Override
	public Date getDeletedDateTime() {
		return deletedDateTime;
	}

	@Override
	public void setDeletedDateTime(Date deletedDateTime) {
		this.deletedDateTime = deletedDateTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		AbstractEntity other = (AbstractEntity) obj;
		if (id != other.id) return false;
		return true;
	}

}
