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
public class InstituteDetails {
	private int ID;
	private String Name;
	private int InstituteRegistrationNumber;
	private EntityAddressDetails Address;
	private Timestamp EstablishedDate;			
	private Timestamp RecordCreateDateTime; 		
	private Timestamp RecordModifiedDateTime;
	
	public InstituteDetails() {
		super();
	}

	public InstituteDetails(int iD, String name,
			int instituteRegistrationNumber, EntityAddressDetails address,
			Timestamp establishedDate, Timestamp recordCreateDateTime,
			Timestamp recordModifiedDateTime) {
		super();
		ID = iD;
		Name = name;
		InstituteRegistrationNumber = instituteRegistrationNumber;
		Address = address;
		EstablishedDate = establishedDate;
		RecordCreateDateTime = recordCreateDateTime;
		RecordModifiedDateTime = recordModifiedDateTime;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getInstituteRegistrationNumber() {
		return InstituteRegistrationNumber;
	}

	public void setInstituteRegistrationNumber(int instituteRegistrationNumber) {
		InstituteRegistrationNumber = instituteRegistrationNumber;
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

	public Timestamp getRecordCreateDateTime() {
		return RecordCreateDateTime;
	}

	public void setRecordCreateDateTime(Timestamp recordCreateDateTime) {
		RecordCreateDateTime = recordCreateDateTime;
	}

	public Timestamp getRecordModifiedDateTime() {
		return RecordModifiedDateTime;
	}

	public void setRecordModifiedDateTime(Timestamp recordModifiedDateTime) {
		RecordModifiedDateTime = recordModifiedDateTime;
	}		
}

