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
public class BatchDetails {
	
	private int ID;							//INT,
	private String UniqueID;					//CHAR(36),
	private String Name;						//NCHAR(100),
	private CourseDetails Course;						//Course object
	private String Timing;						//NCHAR(50),
	private int BatctchStrength;				//INT,
	private Timestamp StartDate;					//DATE,
	private Timestamp EndDate;						//DATE,
	private Timestamp CenterID;					//INT,
	private Timestamp RecordCreateTIMESTAMP;		//TIMESTAMP,
	private Timestamp RecordModifiedTIMESTAMP;		//TIMESTAMP
	
	public BatchDetails() {
		super();
	}
	public BatchDetails(int iD, String uniqueID, String name,
			CourseDetails course, String timing, int batctchStrength,
			Timestamp startDate, Timestamp endDate, Timestamp centerID,
			Timestamp recordCreateTIMESTAMP, Timestamp recordModifiedTIMESTAMP) {
		super();
		ID = iD;
		UniqueID = uniqueID;
		Name = name;
		Course = course;
		Timing = timing;
		BatctchStrength = batctchStrength;
		StartDate = startDate;
		EndDate = endDate;
		CenterID = centerID;
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
	public CourseDetails getCourse() {
		return Course;
	}
	public void setCourse(CourseDetails course) {
		Course = course;
	}
	public String getTiming() {
		return Timing;
	}
	public void setTiming(String timing) {
		Timing = timing;
	}
	public int getBatctchStrength() {
		return BatctchStrength;
	}
	public void setBatctchStrength(int batctchStrength) {
		BatctchStrength = batctchStrength;
	}
	public Timestamp getStartDate() {
		return StartDate;
	}
	public void setStartDate(Timestamp startDate) {
		StartDate = startDate;
	}
	public Timestamp getEndDate() {
		return EndDate;
	}
	public void setEndDate(Timestamp endDate) {
		EndDate = endDate;
	}
	public Timestamp getCenterID() {
		return CenterID;
	}
	public void setCenterID(Timestamp centerID) {
		CenterID = centerID;
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