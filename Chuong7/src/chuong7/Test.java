/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong7;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) {
        ArrayList<Student> listOfStudent = new ArrayList<Student>();
        listOfStudent.add(new Student(111, "An", 19));
        listOfStudent.add(new Student(118, "Binh", 18));
        listOfStudent.add(new Student(114, "Mai", 22));

        //Test Student1
        Collections.sort(listOfStudent);
        for (Student st : listOfStudent) {
            System.out.println(st.getId()+" "+st.getName()+" "+st.getAge());
        }

    }
}
