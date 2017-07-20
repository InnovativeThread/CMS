/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InnovativeThread.cms.Entity;

import java.sql.Timestamp;

/**
 *
 * @author MOHIT
 */
public class EntityContactDetails {
	
	private String ID;					//CHAR(36),
	private String Forename;				//CHAR(50),
	private String Surname;					//CHAR(50),
	private int ContactNumber;				//NUMBER(12),
	private String Email;					//NCHAR(50),
	private EntityAddressDetails Address;			//CHAR(36),
	private EntityType RelatedEntityType;			//INT,
	private RelationType RelationType;                      //INT,
	private String RelatedEntityID;				//CHAR(36),
	private Timestamp RecordCreateTIMESTAMP;		//TIMESTAMP,
	private Timestamp RecordModifiedTIMESTAMP;		//TIMESTAMP
	public EntityContactDetails() {
		super();
	}
	public EntityContactDetails(String iD, String forename, String surname,
			int contactNumber, String email, EntityAddressDetails address,
			EntityType relatedEntityType,
			RelationType relationType,
			String relatedEntityID, Timestamp recordCreateTIMESTAMP,
			Timestamp recordModifiedTIMESTAMP) {
		super();
		ID = iD;
		Forename = forename;
		Surname = surname;
		ContactNumber = contactNumber;
		Email = email;
		Address = address;
		RelatedEntityType = relatedEntityType;
		RelationType = relationType;
		RelatedEntityID = relatedEntityID;
		RecordCreateTIMESTAMP = recordCreateTIMESTAMP;
		RecordModifiedTIMESTAMP = recordModifiedTIMESTAMP;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getForename() {
		return Forename;
	}
	public void setForename(String forename) {
		Forename = forename;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public int getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(int contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public EntityAddressDetails getAddress() {
		return Address;
	}
	public void setAddress(EntityAddressDetails address) {
		Address = address;
	}
	public EntityType getRelatedEntityType() {
		return RelatedEntityType;
	}
	public void setRelatedEntityType(EntityType relatedEntityType) {
		RelatedEntityType = relatedEntityType;
	}
	public RelationType getRelationType() {
		return RelationType;
	}
	public void setRelationType(RelationType relationType) {
		RelationType = relationType;
	}
	public String getRelatedEntityID() {
		return RelatedEntityID;
	}
	public void setRelatedEntityID(String relatedEntityID) {
		RelatedEntityID = relatedEntityID;
	}
	public Timestamp getRecordCreateTIMESTAMP() {
		return RecordCreateTIMESTAMP;
	}
	public void setRecordCreateTIMESTAMP(Timestamp recordCreateTIMESTAMP) {
		RecordCreateTIMESTAMP = recordCreateTIMESTAMP;
	}
	public Timestamp getRecordModifiedTIMESTAMP() {
		return RecordModifiedTIMESTAMP;
	}
	public void setRecordModifiedTIMESTAMP(Timestamp recordModifiedTIMESTAMP) {
		RecordModifiedTIMESTAMP = recordModifiedTIMESTAMP;
	}		
}