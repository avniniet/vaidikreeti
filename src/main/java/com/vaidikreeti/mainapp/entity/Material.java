package com.vaidikreeti.mainapp.entity;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author prostriker23
 * @since  1.0
 * @version 1.0
 */


@Entity
@Table(name="material")
@JsonIgnoreProperties
public class Material implements Serializable {

	
	@Id
	@Column(name="material_id", unique = true, nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer materialId;
	
	
	@Column(name="material_name")
	private String materialName;
	
	
	@Column(name="material_cost")
	private Double materialCost;
	
	
	@Column(name="material_desc")
	private String materialDescription;
	
	@Column(name="material_discount_percent")
	private Integer materialDiscountPercentage;
	
	@Column(name="material_advantage")
	private String	materialAdvantage;
	
	
	@Column
	private String imagePath;
	
	@Transient
	@OneToOne(targetEntity = Status.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "status_id",referencedColumnName = "status_id", insertable = false, updatable = false)
	private Status status;
	
	@Column(name="create_date", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createDate=new Date();
	
	
	@Column(name="last_update_date")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date lastUpdateDate=new Date();


	public Material(Integer materialId, String materialName, Double materialCost, String materialDescription,
			Integer materialDiscountPercentage, String materialAdvantage, String imagePath, Status status,
			Date createDate, Date lastUpdateDate) {
		super();
		this.materialId = materialId;
		this.materialName = materialName;
		this.materialCost = materialCost;
		this.materialDescription = materialDescription;
		this.materialDiscountPercentage = materialDiscountPercentage;
		this.materialAdvantage = materialAdvantage;
		this.imagePath = imagePath;
		this.status = status;
		this.createDate = createDate;
		this.lastUpdateDate = lastUpdateDate;
	}


	public Integer getMaterialId() {
		return materialId;
	}


	public void setMaterialId(Integer materialId) {
		this.materialId = materialId;
	}


	public String getMaterialName() {
		return materialName;
	}


	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}


	public Double getMaterialCost() {
		return materialCost;
	}


	public void setMaterialCost(Double materialCost) {
		this.materialCost = materialCost;
	}


	public String getMaterialDescription() {
		return materialDescription;
	}


	public void setMaterialDescription(String materialDescription) {
		this.materialDescription = materialDescription;
	}


	public Integer getMaterialDiscountPercentage() {
		return materialDiscountPercentage;
	}


	public void setMaterialDiscountPercentage(Integer materialDiscountPercentage) {
		this.materialDiscountPercentage = materialDiscountPercentage;
	}


	public String getMaterialAdvantage() {
		return materialAdvantage;
	}


	public void setMaterialAdvantage(String materialAdvantage) {
		this.materialAdvantage = materialAdvantage;
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
		return "Material [materialId=" + materialId + ", materialName=" + materialName + ", materialCost="
				+ materialCost + ", materialDescription=" + materialDescription + ", materialDiscountPercentage="
				+ materialDiscountPercentage + ", materialAdvantage=" + materialAdvantage + ", imagePath=" + imagePath
				+ ", status=" + status + ", createDate=" + createDate + ", lastUpdateDate=" + lastUpdateDate + "]";
	}
	
	
	
	
	
	
	
	
	
}