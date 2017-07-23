/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InnovativeThread.cms.dao;

import com.InnovativeThread.cms.Connection.DBConnection;
import com.InnovativeThread.cms.Entity.BatchDetails;
import com.InnovativeThread.cms.Entity.CourseDetails;
import com.InnovativeThread.cms.Entity.EntityAddressDetails;
import com.InnovativeThread.cms.Entity.StudentDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MOHIT
 */
public class StudentDAOImpl implements IStudent{
    private DBConnection dbc;
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public StudentDAOImpl() {
        dbc=new DBConnection();
        con=dbc.getConnection();
    }    

    @Override
    public void addStudentDetails(StudentDetails sd) {
        try {
            ps=con.prepareStatement("insert into StudentDetails(UniqueID,FirstName,MiddleName,LastName,MobileNumber,"
                    + "Email,Gender,BloodGroup,Address,DateOfBirth,Qualification,RecordCreateTIMESTAMP)"
                    + " values(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, sd.getUniqueID());
            ps.setString(2, sd.getFirstName());
            ps.setString(3, sd.getMiddleName());
            ps.setString(4, sd.getLastName());
            ps.setLong(5, sd.getMobileNumber());
            ps.setString(6, sd.getGender());
            ps.setString(7, sd.getBloodGroup());
            ps.setString(8, sd.getEmail());
            ps.setString(9, sd.getAddress().getID());
            ps.setTimestamp(10, sd.getDateOfBirth());
            ps.setString(11, sd.getQualification());
            ps.setTimestamp(12, new Timestamp((new Date()).getTime()));
            
            
            ps.executeUpdate();
            System.out.println("record successfully inserted.....");
        } catch (SQLException ex) {
            System.out.println("Excetion occur during inserting values into StudentDetails.....");
        }
        
    }

    @Override
    public void updateStudentDetails(StudentDetails sd) {
        
    }

    @Override
    public void deleteStudenttDetails(int roll_no) {
        
    }

    @Override
    public StudentDetails getStudentDetails(int roll_no) {
            StudentDetails sd=null;
            EntityAddressDetails EAD=null;        

            try{
            String query="select SD.ID as StudentID,UNIQUEID,FIRSTNAME,MIDDLENAME,LASTNAME,MOBILENUMBER,EMAIL,GENDER,BLOODGROUP,ADDRESS,DATEOFBIRTH,QUALIFICATION,SD.RECORDCREATETIMESTAMP as RECORDCREATETIMESTAMP_S,SD.RECORDMODIFIEDTIMESTAMP as RECORDMODIFIEDTIMESTAMP_S," +
                          "EAD.ID as Add_ID,ENTITYTYPE,HOUSENUMBER,HOUSENAME,SURVEYNO,STREET,CITY,DISTRICT,STATE,COUNTRY,PIN,EAD.RECORDCREATETIMESTAMP as RECORDCREATETIMESTAMP_A,EAD.RECORDMODIFIEDTIMESTAMP as RECORDMODIFIEDTIMESTAMP_A"+
                            " from StudentDetails SD"+
                            " inner join EntityAddressDetails EAD ON EAD.ID=SD.Address"+
                            " where SD.ID=";
                System.out.println(query+roll_no);
            ps=con.prepareStatement(query+roll_no);
            rs=ps.executeQuery();

            if(!rs.next()){
                System.out.println("No Records Found.....");
            }
            else{
                while(rs.next()){
                    sd=new StudentDetails();
                    EAD=new EntityAddressDetails();

                    EAD.setID(rs.getString("Add_ID"));
                    EAD.setEntityType(rs.getInt("EntityType"));
                    EAD.setHouseNumber(rs.getInt("HouseNumber"));
                    EAD.setHouseName(rs.getString("HouseName"));
                    EAD.setSurveyNo(rs.getInt("SurveyNo"));
                    EAD.setStreet("Street");
                    EAD.setCity("City");
                    EAD.setDistrict("District");
                    EAD.setState("District");
                    EAD.setCountry("Country");
                    EAD.setPIN(rs.getInt("PIN"));
                    EAD.setRecordCreateTIMESTAMP(rs.getTimestamp("RECORDCREATETIMESTAMP_A"));
                    EAD.setRecordModifiedTIMESTAMP(rs.getTimestamp("RECORDMODIFIEDTIMESTAMP_A"));

                    sd.setID(rs.getInt("StudentID"));
                    sd.setUniqueID(rs.getString("UniqueID"));
                    sd.setFirstName(rs.getString("FirstName"));
                    sd.setMiddleName(rs.getString("MiddleName"));
                    sd.setLastName(rs.getString("LastName"));
                    sd.setMobileNumber(rs.getLong("MobileNumber"));
                    sd.setEmail(rs.getString("Email"));
                    sd.setGender(rs.getString("Gender"));
                    sd.setBloodGroup(rs.getString("BloodGroup"));
                    sd.setAddress(EAD);
                    sd.setDateOfBirth(rs.getTimestamp("DateOfBirth"));
                    sd.setQualification(rs.getString("Qualification"));
                    sd.setRecordCreateTIMESTAMP(rs.getTimestamp("RECORDCREATETIMESTAMP_S"));
                    sd.setRecordModifiedTIMESTAMP(rs.getTimestamp("RECORDMODIFIEDTIMESTAMP_A"));            

                }
            }
        }
        catch(Exception e){
            System.out.println("Error while fetching student records.....");
        }
        
        return sd;
    }

    @Override
    public List<StudentDetails> fetchStudentDetailsCourseWise(CourseDetails c) {
        return new ArrayList<StudentDetails>();
    }

    @Override
    public List<StudentDetails> fetchStudentDetailsBatchWise(BatchDetails b) {
        return new ArrayList<StudentDetails>();
    }

    @Override
    public List<StudentDetails> fetchAllStudentDetails() {
            StudentDetails sd=null;            
            int roll_no;
            List rn_list=new ArrayList<Integer>();
            List<StudentDetails> stud_list=new ArrayList<StudentDetails>();
            
            try{
            String query="select ID from StudentDetails SD";
                //System.out.println(query+roll_no);
            ps=con.prepareStatement(query);//+roll_no);
            rs=ps.executeQuery();

            if(!rs.next()){
                System.out.println("No Records Found.....");
            }
            else{
                while(rs.next()){
                    roll_no=rs.getInt(1);
                    System.out.println("Roll_No:"+roll_no);
                    sd=new StudentDAOImpl().getStudentDetails(roll_no);
                    stud_list.add(sd);
                }                
            }
            }
            catch(Exception e){
                System.out.println("Exception during fetching student records.....");
            }            
        return stud_list;
    }
    public static void main(String[] args) {
        //StudentDetails s=new StudentDetails();
       /* s.setFirstName("ganya");
        s.setLastName("kallu");
        s.setMobileNumber(9405442840L);
        s.setAddress(new EntityAddressDetails());
        new StudentDAOImpl().addStudentDetails(s);*/
       //StudentDetails sd=new StudentDAOImpl().getStudentDetails(1);
       
       List<StudentDetails> sd=new ArrayList<StudentDetails>();
       sd=new StudentDAOImpl().fetchAllStudentDetails();
       for(StudentDetails s:sd)
       {
           System.out.println("123456789");
        if(s!=null)
        System.out.println("Id:"+s.getID()+" Name:"+s.getFirstName());
       }
    }
}
