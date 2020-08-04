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
public class Test {

    public static void main(String[] args) throws Exception {
        //getAllStudent
//        StudentDAO stdDAO = new StudentDAO();
//        System.out.println(stdDAO.getAllStudents());

//        Student std = new Student("19211TT6754", "Lam", "lam@gmail.com");//addStudent
//        stdDAO.addStudent(std);
//        stdDAO.removeStudentByID("19211TT6754");//removeStudentByID
//        Student std = new Student("19211TT6754", "Anh", "lam@gmail.com");//update
//        stdDAO.update(std);
        
        UsersDao usd = new UsersDao();
        Users us = new Users("uyen", "123");
        if (usd.logIn(us)) {
            System.out.println("Dang nhap thanh cong!");
        } else {
            System.out.println("Dang nhap that bai!");
        }

    }
}
