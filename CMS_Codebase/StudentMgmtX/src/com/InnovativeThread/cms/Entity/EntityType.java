/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentMgmt.Entity;

import java.sql.Timestamp;

/**
 *
 * @author MOHIT
 */
public class EntityType {

	private int ID;							//INT,
	private String EntityName;					//CHAR(50),
	private Timestamp RecordCreateTIMESTAMP;		//TIMESTAMP
		
	public EntityType() {
		super();
	}	
	
	public EntityType(int iD, String entityName, Timestamp recordCreateTIMESTAMP) {
		super();
		ID = iD;
		EntityName = entityName;
		RecordCreateTIMESTAMP = recordCreateTIMESTAMP;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEntityName() {
		return EntityName;
	}
	public void setEntityName(String entityName) {
		EntityName = entityName;
	}
	public Timestamp getRecordCreateTIMESTAMP() {
		return RecordCreateTIMESTAMP;
	}
	public void setRecordCreateTIMESTAMP(Timestamp recordCreateTIMESTAMP) {
		RecordCreateTIMESTAMP = recordCreateTIMESTAMP;
	}	
}