package com.vaidikreeti.mainapp.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author prostriker23
 * @since  1.0
 * @version 1.0
 */

@Entity
@Table(name="gotra")
@JsonIgnoreProperties
public class Gotra {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="gotra_id", unique = true, nullable = false)
	private Integer gotraId;
	
	
	@Column(name="gotra_name")
	private String gotraName;
	
	@Column(name="create_date")
	//@Temporal(TemporalType.TIME)
	@CreationTimestamp
	private LocalDateTime createDate=LocalDateTime.now();
	
	
	@Column(name="last_update_date")
	//@Temporal(TemporalType.TIME)
	@CreationTimestamp
	private LocalDateTime lastUpdateDate=LocalDateTime.now();


	public Gotra(String gotraName, LocalDateTime createDate, LocalDateTime lastUpdateDate) {
		super();
		this.gotraName = gotraName;
		this.createDate = createDate;
		this.lastUpdateDate = lastUpdateDate;
	}
	
	


	public Gotra() {
		
	}




	public Integer getGotraId() {
		return gotraId;
	}


	public void setGotraId(Integer gotraId) {
		this.gotraId = gotraId;
	}


	public String getGotraName() {
		return gotraName;
	}


	public void setGotraName(String gotraName) {
		this.gotraName = gotraName;
	}


	public LocalDateTime getCreateDate() {
		return createDate;
	}


	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}


	public LocalDateTime getLastUpdateDate() {
		return lastUpdateDate;
	}


	public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}


	@Override
	public String toString() {
		return "Gotra [gotraId=" + gotraId + ", gotraName=" + gotraName + ", createDate=" + createDate
				+ ", lastUpdateDate=" + lastUpdateDate + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
