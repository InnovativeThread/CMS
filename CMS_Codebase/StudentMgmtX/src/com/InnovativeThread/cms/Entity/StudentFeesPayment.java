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
public class StudentFeesPayment {
	private int ID;							//INT,
	private String UniqueID;					//CHAR(36),
	private Timestamp PaymentDate;					//TIMESTAMP,
	private StudentDetails student;					//Student Object cause foreign key
	private PaymentMode paymentMode;				//PaymentMode object
	private int IsFull;						//NUMBER(1),
	private int IsPartial;                                          //NUMBER(1),
	private int IsNonPaid;                                          //NUMBER(1),
	private String UpdatedBy;					//CHAR(36),
	private Timestamp RecordCreateTIMESTAMP;                        //TIMESTAMP,
	private Timestamp RecordModifiedTIMESTAMP;                      //TIMESTAMP
	
	public StudentFeesPayment() {
		super();
	}

	public StudentFeesPayment(int iD, String uniqueID, Timestamp paymentDate,
			StudentDetails student, PaymentMode paymentMode, int isFull,
			int isPartial, int isNonPaid, String updatedBy,
			Timestamp recordCreateTIMESTAMP, Timestamp recordModifiedTIMESTAMP) {
		super();
		ID = iD;
		UniqueID = uniqueID;
		PaymentDate = paymentDate;
		this.student = student;
		this.paymentMode = paymentMode;
		IsFull = isFull;
		IsPartial = isPartial;
		IsNonPaid = isNonPaid;
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

	public Timestamp getPaymentDate() {
		return PaymentDate;
	}

	public void setPaymentDate(Timestamp paymentDate) {
		PaymentDate = paymentDate;
	}

	public StudentDetails getStudent() {
		return student;
	}

	public void setStudent(StudentDetails student) {
		this.student = student;
	}

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public int getIsFull() {
		return IsFull;
	}

	public void setIsFull(int isFull) {
		IsFull = isFull;
	}

	public int getIsPartial() {
		return IsPartial;
	}

	public void setIsPartial(int isPartial) {
		IsPartial = isPartial;
	}

	public int getIsNonPaid() {
		return IsNonPaid;
	}

	public void setIsNonPaid(int isNonPaid) {
		IsNonPaid = isNonPaid;
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