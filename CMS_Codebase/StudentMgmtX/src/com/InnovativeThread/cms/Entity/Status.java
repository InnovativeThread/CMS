/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InnovativeThread.cms.Entity;

/**
 *
 * @author MOHIT
 */
public class Status {
	private int ID;			//INT,
	private String Status;		//CHAR(20)
		
	public Status() {
		super();
	}
		
	public Status(int iD, String status) {
		super();
		ID = iD;
		Status = status;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}	
}