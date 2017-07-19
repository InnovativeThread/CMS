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
public class ClassEnquiry {
	
	private String ID;							//CHAR(36),
	private String Forename;					//CHAR(50),
	private String Surname;						//CHAR(50),
	private int ContactNumber;				//NUMBER(12),
	private String Email;						//NCHAR(100),
	private String EnquiredForWhom;				//NCHAR(100),
	private String EnquiredForWhat;				//NCHAR(100),
	private Timestamp RecordCreateTIMESTAMP;		//TIMESTAMP
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
	public String getEnquiredForWhom() {
		return EnquiredForWhom;
	}
	public void setEnquiredForWhom(String enquiredForWhom) {
		EnquiredForWhom = enquiredForWhom;
	}
	public String getEnquiredForWhat() {
		return EnquiredForWhat;
	}
	public void setEnquiredForWhat(String enquiredForWhat) {
		EnquiredForWhat = enquiredForWhat;
	}
	public Timestamp getRecordCreateTIMESTAMP() {
		return RecordCreateTIMESTAMP;
	}
	public void setRecordCreateTIMESTAMP(Timestamp recordCreateTIMESTAMP) {
		RecordCreateTIMESTAMP = recordCreateTIMESTAMP;
	}	
}