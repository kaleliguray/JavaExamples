package com.yjs3408.model.entity;

import java.io.Serializable;
import java.util.Date;

public interface GenericEntity extends Serializable {

	long getId();
	
	Date getCreatedDateTime();
	
	void setCreatedDateTime(Date createdDateTime);
	
	Date getUpdatedDateTime();
	
	void setUpdatedDateTime(Date updatedDateTime);
	
	Date getDeletedDateTime();
	
	void setDeletedDateTime(Date deletedDateTime);
	
}
