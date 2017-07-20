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
public class EntityAddressDetails {
	
	private String ID;						//CHAR(36),
	private int EntityType;                                         //INT,
	private int HouseNumber;					//INT,
	private String HouseName;					//CHAR(100),
	private int SurveyNo;                                           //INT,
	private String Street;						//CHAR(100),
	private String City;						//CHAR(100),
	private String District;					//CHAR(100),
	private String State;						//CHAR(100),
	private String Country;						//CHAR(100),
	private int PIN;						//INT,
	private Timestamp RecordCreateTIMESTAMP;                        //TIMESTAMP,
	private Timestamp RecordModifiedTIMESTAMP;                      //TIMESTAMP
		
	public EntityAddressDetails() {
		super();
	}
		
	public EntityAddressDetails(String iD, int entityType, int houseNumber,
			String houseName, int surveyNo, String street, String city,
			String district, String state, String country, int pIN,
			Timestamp recordCreateTIMESTAMP, Timestamp recordModifiedTIMESTAMP) {
		super();
		ID = iD;
		EntityType = entityType;
		HouseNumber = houseNumber;
		HouseName = houseName;
		SurveyNo = surveyNo;
		Street = street;
		City = city;
		District = district;
		State = state;
		Country = country;
		PIN = pIN;
		RecordCreateTIMESTAMP = recordCreateTIMESTAMP;
		RecordModifiedTIMESTAMP = recordModifiedTIMESTAMP;
	}	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getEntityType() {
		return EntityType;
	}
	public void setEntityType(int entityType) {
		EntityType = entityType;
	}
	public int getHouseNumber() {
		return HouseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		HouseNumber = houseNumber;
	}
	public String getHouseName() {
		return HouseName;
	}
	public void setHouseName(String houseName) {
		HouseName = houseName;
	}
	public int getSurveyNo() {
		return SurveyNo;
	}
	public void setSurveyNo(int surveyNo) {
		SurveyNo = surveyNo;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
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

