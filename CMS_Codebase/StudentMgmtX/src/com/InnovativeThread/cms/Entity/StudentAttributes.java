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
public class StudentAttributes {

	
	private String ID;					//CHAR(36),
	private StudentDetails Student;				//CHAR(36),
	private CourseDetails Course;				//CHAR(36),
	private FacultyDetails Faculty;				//CHAR(36),
	private BatchDetails Batch;				//CHAR(36),
	private int TotalFees;					//INT,
	private int PaidFees;					//INT,
	private int RemaningFees;				//INT,
	private CenterDetails Center;				//CHAR(36),
	private Status StudentStatus;				//INT,
	private Timestamp RecordCreateTIMESTAMP;		//TIMESTAMP,
	private Timestamp RecordModifiedTIMESTAMP;		//TIMESTAMP
	
	public StudentAttributes() {
		super();
	}

	public StudentAttributes(String iD, StudentDetails student,
			CourseDetails course, FacultyDetails faculty, BatchDetails batch,
			int totalFees, int paidFees, int remaningFees,
			CenterDetails center, Status studentStatus,
			Timestamp recordCreateTIMESTAMP, Timestamp recordModifiedTIMESTAMP) {
		super();
		ID = iD;
		Student = student;
		Course = course;
		Faculty = faculty;
		Batch = batch;
		TotalFees = totalFees;
		PaidFees = paidFees;
		RemaningFees = remaningFees;
		Center = center;
		StudentStatus = studentStatus;
		RecordCreateTIMESTAMP = recordCreateTIMESTAMP;
		RecordModifiedTIMESTAMP = recordModifiedTIMESTAMP;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public StudentDetails getStudent() {
		return Student;
	}

	public void setStudent(StudentDetails student) {
		Student = student;
	}

	public CourseDetails getCourse() {
		return Course;
	}

	public void setCourse(CourseDetails course) {
		Course = course;
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

	public int getTotalFees() {
		return TotalFees;
	}

	public void setTotalFees(int totalFees) {
		TotalFees = totalFees;
	}

	public int getPaidFees() {
		return PaidFees;
	}

	public void setPaidFees(int paidFees) {
		PaidFees = paidFees;
	}

	public int getRemaningFees() {
		return RemaningFees;
	}

	public void setRemaningFees(int remaningFees) {
		RemaningFees = remaningFees;
	}

	public CenterDetails getCenter() {
		return Center;
	}

	public void setCenter(CenterDetails center) {
		Center = center;
	}

	public Status getStudentStatus() {
		return StudentStatus;
	}

	public void setStudentStatus(Status studentStatus) {
		StudentStatus = studentStatus;
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