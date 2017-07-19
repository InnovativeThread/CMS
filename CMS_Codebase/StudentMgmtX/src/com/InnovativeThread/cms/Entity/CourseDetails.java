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
public class CourseDetails {
	
	private int ID;							//INT,
	private String UniqueID;					//CHAR(36),
	private String Name;						//NCHAR(100),
	private String CourseLevel;					//CHAR(10),
	private int Duration;                                           //INT,
	private int Fees;						//INT,
	private CenterDetails Center;					//INT,
	private Timestamp RecordCreateTIMESTAMP;                        //TIMESTAMP,
	private Timestamp RecordModifiedTIMESTAMP;                      //TIMESTAMP
	public CourseDetails() {
		super();
	}
	public CourseDetails(int iD, String uniqueID, String name,
			String courseLevel, int duration, int fees, CenterDetails center,
			Timestamp recordCreateTIMESTAMP, Timestamp recordModifiedTIMESTAMP) {
		super();
		ID = iD;
		UniqueID = uniqueID;
		Name = name;
		CourseLevel = courseLevel;
		Duration = duration;
		Fees = fees;
		Center = center;
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
	public String getCourseLevel() {
		return CourseLevel;
	}
	public void setCourseLevel(String courseLevel) {
		CourseLevel = courseLevel;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	public int getFees() {
		return Fees;
	}
	public void setFees(int fees) {
		Fees = fees;
	}
	public CenterDetails getCenter() {
		return Center;
	}
	public void setCenter(CenterDetails center) {
		Center = center;
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
