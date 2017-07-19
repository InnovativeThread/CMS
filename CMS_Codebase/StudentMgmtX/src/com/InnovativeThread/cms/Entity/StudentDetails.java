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

public class StudentDetails {
	
	private int ID;							//INT,
	private String UniqueID;					//CHAR(36),
	private String FirstName;					//CHAR(50),
	private String MiddleName;					//CHAR(50),
	private String LastName;					//CHAR(50),
	private int MobileNumber;                                       //NUMBER(12),
	private String Email;						//NCHAR(50),
	private String Gender;						//INT,
	private String BloodGroup;					//NCHAR(15),
	private String Address;						//CHAR(36),
	private Timestamp DateOfBirth;					//DATE,
	private String Qualification;                                   //CHAR(100),
	private Timestamp RecordCreateTIMESTAMP;                        //TIMESTAMP,
	private Timestamp RecordModifiedTIMESTAMP;                      //TIMESTAMP
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
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getBloodGroup() {
		return BloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Timestamp getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Timestamp dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
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

