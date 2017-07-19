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
public class PaymentMode {
	
	private String ID;							//CHAR(36),
	private String PaymentType;					//CHAR(50),
	private Timestamp RecordCreateTIMESTAMP;		//TIMESTAMP,
	private Timestamp RecordModifiedTIMESTAMP;		//TIMESTAMP
	
	
	public PaymentMode() {
		super();
	}
	
	public PaymentMode(String iD, String paymentType,
			Timestamp recordCreateTIMESTAMP, Timestamp recordModifiedTIMESTAMP) {
		super();
		ID = iD;
		PaymentType = paymentType;
		RecordCreateTIMESTAMP = recordCreateTIMESTAMP;
		RecordModifiedTIMESTAMP = recordModifiedTIMESTAMP;
	}

	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
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