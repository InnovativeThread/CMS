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
public interface IStudent {
    public void addStudentDetails(StudentDetails sd);
    public void updateStudentDetails(StudentDetails sd);
    public void deleteStudenttDetails(int roll_no);
    public StudentDetails getStudentDetails(int roll_no);
    public List<StudentDetails> fetchStudentDetailsCourseWise(CourseDetails c);
    public List<StudentDetails> fetchStudentDetailsBatchWise(BatchDetails b);
    public List<StudentDetails> fetchAllStudentDetails();
}
