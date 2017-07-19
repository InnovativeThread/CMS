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
public class RelationType {
	
	private int ID;							//INT,
	private String Type;						//CHAR(20),
	private Timestamp RecordCreateTIMESTAMP;		//TIMESTAMP
	
	public RelationType() {
		super();
	}
		
	public RelationType(int iD, String type, Timestamp recordCreateTIMESTAMP) {
		super();
		ID = iD;
		Type = type;
		RecordCreateTIMESTAMP = recordCreateTIMESTAMP;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Timestamp getRecordCreateTIMESTAMP() {
		return RecordCreateTIMESTAMP;
	}
	public void setRecordCreateTIMESTAMP(Timestamp recordCreateTIMESTAMP) {
		RecordCreateTIMESTAMP = recordCreateTIMESTAMP;
	}	
}