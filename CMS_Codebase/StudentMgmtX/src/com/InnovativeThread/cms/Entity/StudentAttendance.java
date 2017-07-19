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
public class StudentAttendance {
	
	private int ID;							//INT,
	private String UniqueID;					//CHAR(36),
	private Timestamp Date;						//DATE,
	private StudentDetails Student;						//CHAR(36),
	private FacultyDetails Faculty;						//CHAR(36),
	private BatchDetails Batch;						//CHAR(36),
	private CourseDetails Course;						//CHAR(36),
	private int IsPresent;					//NUMBER(1),
	private int IsAbsent;					//NUMBER(1),
	private String UpdatedBy;					//CHAR(36),
	private Timestamp RecordCreateTIMESTAMP;		//TIMESTAMP,
	private Timestamp RecordModifiedTIMESTAMP;		//TIMESTAMP
	
	public StudentAttendance() {
		super();
	}

	public StudentAttendance(int iD, String uniqueID, Timestamp date,
			StudentDetails student, FacultyDetails faculty, BatchDetails batch,
			CourseDetails course, int isPresent, int isAbsent,
			String updatedBy, Timestamp recordCreateTIMESTAMP,
			Timestamp recordModifiedTIMESTAMP) {
		super();
		ID = iD;
		UniqueID = uniqueID;
		Date = date;
		Student = student;
		Faculty = faculty;
		Batch = batch;
		Course = course;
		IsPresent = isPresent;
		IsAbsent = isAbsent;
		UpdatedBy = updatedBy;
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

	public Timestamp getDate() {
		return Date;
	}

	public void setDate(Timestamp date) {
		Date = date;
	}

	public StudentDetails getStudent() {
		return Student;
	}

	public void setStudent(StudentDetails student) {
		Student = student;
	}

	public FacultyDetails getFaculty() {
		return Faculty;
	}

	public void setFaculty(FacultyDetails faculty) {
		Faculty = faculty;
	}

	public BatchDetails getBatch() {
		return Batch;
	}

	public void setBatch(BatchDetails batch) {
		Batch = batch;
	}

	public CourseDetails getCourse() {
		return Course;
	}

	public void setCourse(CourseDetails course) {
		Course = course;
	}

	public int getIsPresent() {
		return IsPresent;
	}

	public void setIsPresent(int isPresent) {
		IsPresent = isPresent;
	}

	public int getIsAbsent() {
		return IsAbsent;
	}

	public void setIsAbsent(int isAbsent) {
		IsAbsent = isAbsent;
	}

	public String getUpdatedBy() {
		return UpdatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		UpdatedBy = updatedBy;
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