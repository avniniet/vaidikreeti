package com.vaidikreeti.mainapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Status {
	
	
	@Id
	@Column(name="status_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer statusId;
	
	
	@Column(name="status_name")
	private String statusName;
	
	@Column(name="status_desc")
	private String description;
	
	@Column(name="create_date")
	@Temporal(TemporalType.DATE)// this annotation is used for field for which precision is required
	private Date createDate;
	
	
	@Column(name="last_update_date")
	@Temporal(TemporalType.DATE)
	private Date lastUpdateDate;
	
	public Status(Integer statusId, String statusName, String description, Date createDate, Date lastUpdateDate) {
		super();
		this.statusId = statusId;
		this.statusName = statusName;
		this.description = description;
		this.createDate = createDate;
		this.lastUpdateDate = lastUpdateDate;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", statusName=" + statusName + ", description=" + description
				+ ", createDate=" + createDate + ", lastUpdateDate=" + lastUpdateDate + "]";
	}
	
	 
	
	
	
	
	

}
