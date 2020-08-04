/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong5;

/**
 *
 * @author Administrator
 */
public class Student {
    private String student_id;
    private String name;
    private String email;

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Student(){
        
    }
    public Student(String student_id, String name, String email){
        this.student_id = student_id;
        this.name = name;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "\nStudent_id:" + student_id + "\nName:" + name + "\nEmail:" + email + "\n";
    }
    
}
