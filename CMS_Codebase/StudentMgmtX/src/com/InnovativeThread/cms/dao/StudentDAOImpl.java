/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InnovativeThread.cms.dao;

import com.InnovativeThread.cms.Connection.DBConnection;
import com.InnovativeThread.cms.Entity.BatchDetails;
import com.InnovativeThread.cms.Entity.CourseDetails;
import com.InnovativeThread.cms.Entity.StudentDetails;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MOHIT
 */
public class StudentDAOImpl implements IStudent{
    private DBConnection dbc;
    private Connection con;
    
    public StudentDAOImpl() {
        dbc=new DBConnection();
        con=dbc.getConnection();
    }    

    @Override
    public void addStudentDetails(StudentDetails sd) {
        
    }

    @Override
    public void updateStudentDetails(StudentDetails sd) {
        
    }

    @Override
    public void deleteStudenttDetails(int roll_no) {
        
    }

    @Override
    public StudentDetails getStudentDetails(int roll_no) {
        return new StudentDetails();
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
        return new ArrayList<StudentDetails>();
    }
    
}
