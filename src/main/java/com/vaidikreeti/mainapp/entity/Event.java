package com.vaidikreeti.mainapp.entity;


/**
 * @author prostriker23
 * @since  1.0
 * @version 1.0
 */


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="event")
@JsonIgnoreProperties
public class Event implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="event_id", unique = true, nullable = false)
	private Integer eventId;
	
	
	@Column(name="event_name")
	private String eventName;
	
	
	@Column(name="event_cost")
	private Double eventCost;
	
	
	
	@Column(name="event_discount_percent")
	private Integer eventDiscountPercentage;
	
	@Column(name="event_story")
	private String eventStory;
	
	
	@Column(name="img_path")
	private String imagePath;
	
	
	@Transient
	@OneToOne(targetEntity = Status.class, fetch = FetchType.LAZY)
	@JoinColumn(name="status_id" , referencedColumnName = "status_id" , insertable = false, updatable = false)
	@JsonIgnore
	private Status status;
	
	@Column(name="create_date", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createDate=new Date();
	
	@Column(name="last_update_date")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date lastUpdateDate=new Date();

	public Event(Integer eventId, String eventName, Double eventCost, Integer eventDiscountPercentage,
			String eventStory, String imagePath, Status status, Date createDate, Date lastUpdateDate) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventCost = eventCost;
		this.eventDiscountPercentage = eventDiscountPercentage;
		this.eventStory = eventStory;
		this.imagePath = imagePath;
		this.status = status;
		this.createDate = createDate;
		this.lastUpdateDate = lastUpdateDate;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Double getEventCost() {
		return eventCost;
	}

	public void setEventCost(Double eventCost) {
		this.eventCost = eventCost;
	}

	public Integer getEventDiscountPercentage() {
		return eventDiscountPercentage;
	}

	public void setEventDiscountPercentage(Integer eventDiscountPercentage) {
		this.eventDiscountPercentage = eventDiscountPercentage;
	}

	public String getEventStory() {
		return eventStory;
	}

	public void setEventStory(String eventStory) {
		this.eventStory = eventStory;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", eventCost=" + eventCost
				+ ", eventDiscountPercentage=" + eventDiscountPercentage + ", eventStory=" + eventStory + ", imagePath="
				+ imagePath + ", status=" + status + ", createDate=" + createDate + ", lastUpdateDate=" + lastUpdateDate
				+ "]";
	}
	
	
	
	
}