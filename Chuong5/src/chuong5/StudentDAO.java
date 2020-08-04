/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong5;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class StudentDAO {

    public ArrayList<Student> getAllStudents() throws Exception {
        ArrayList<Student> studentList = new ArrayList<>();
        String sql = "Select * from student;";
        ResultSet rs = DataBaseUtil.getData(sql);
        Student std = new Student();
        while (rs.next()) {
            std = new Student();
            std.setStudent_id(rs.getString("student_id"));
            std.setName(rs.getString("name"));
           std.setEmail(rs.getString("email"));
           studentList.add(std);
        }
        return studentList;
    }
    
    public void addStudent(Student std) throws Exception{
        String sql = String.format("Insert into student values('%s', '%s', '%s');", std.getStudent_id(), std.getName(), std.getEmail());
        DataBaseUtil.setData(sql);
    }
    
    public void removeStudentByID(String id) throws Exception{   
        String sql = "Delete from student where student_id='"+id+"';";
        DataBaseUtil.setData(sql);
    }
    
    public void update(Student std) throws Exception{
        String sql = "Update student set name='"+std.getName()+"', email='"+std.getEmail()+"' where student_id='"+std.getStudent_id()+"';";
        DataBaseUtil.setData(sql);
    }
}
