/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InnovativeThread.cms.dao;

import com.InnovativeThread.cms.Entity.BatchDetails;
import com.InnovativeThread.cms.Entity.CourseDetails;
import com.InnovativeThread.cms.Entity.StudentDetails;
import java.util.List;

/**
 *
 * @author MOHIT
 */
public class StudentDAOImpl implements IStudent{

    @Override
    public void addStudentDetails(StudentDetails sd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateStudentDetails(StudentDetails sd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteStudenttDetails(int roll_no) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public StudentDetails getStudentDetails(int roll_no) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StudentDetails> fetchStudentDetailsCourseWise(CourseDetails c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StudentDetails> fetchStudentDetailsBatchWise(BatchDetails b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StudentDetails> fetchAllStudentDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
