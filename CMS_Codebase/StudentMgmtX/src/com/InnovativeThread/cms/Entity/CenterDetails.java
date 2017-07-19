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
public class CenterDetails {
private int	ID;						
	private String UniqueID; 				
	private String Name;						
	private int CenterNumber; 				
	private EntityAddressDetails Address;					
	private Timestamp EstablishedDate; 			
	private int InstituteID; 				
	private Timestamp RecordCreateTIMESTAMP; 	
	private Timestamp RecordModifiedTIMESTAMP;
	public CenterDetails() {
		super();
	}
	public CenterDetails(int iD, String uniqueID, String name,
			int centerNumber, EntityAddressDetails address,
			Timestamp establishedDate, int instituteID,
			Timestamp recordCreateTIMESTAMP, Timestamp recordModifiedTIMESTAMP) {
		super();
		ID = iD;
		UniqueID = uniqueID;
		Name = name;
		CenterNumber = centerNumber;
		Address = address;
		EstablishedDate = establishedDate;
		InstituteID = instituteID;
		RecordCreateTIMESTAMP = recordCreateTIMESTAMP;
		RecordModifiedTIMESTAMP = recordModifiedTIMESTAMP;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUniqueID() {
		return UniqueID;
	}
	public void setUniqueID(String uniqueID) {
		UniqueID = uniqueID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getCenterNumber() {
		return CenterNumber;
	}
	public void setCenterNumber(int centerNumber) {
		CenterNumber = centerNumber;
	}
	public EntityAddressDetails getAddress() {
		return Address;
	}
	public void setAddress(EntityAddressDetails address) {
		Address = address;
	}
	public Timestamp getEstablishedDate() {
		return EstablishedDate;
	}
	public void setEstablishedDate(Timestamp establishedDate) {
		EstablishedDate = establishedDate;
	}
	public int getInstituteID() {
		return InstituteID;
	}
	public void setInstituteID(int instituteID) {
		InstituteID = instituteID;
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
