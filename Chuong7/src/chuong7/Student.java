/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong7;

/**
 *
 * @author Administrator
 */
public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student st) {
        //Sap xep giam dan, tang dan theo tuoi
//        if (age == st.age) {
//            return 0;
//        } else if (age < st.age) {
//            return 1;
//        } else {
//            return -1;
//        }

        //Sap xep tang dan theo ten
//        return name.compareTo(st.name);
        //Sap xep giam dan theo ten
//        return (name.compareTo(st.name))* -1;
        //Sap xep tuoi tang roi ten tang
//        if (age == st.age) {
//            return name.compareTo(st.name);
//        } else if (age > st.age) {
//            return 1;
//        } else {
//            return -1;
//        }

        //Sap xep ten tang roi tuoi giam
        if (name.compareTo(st.name) == 0) {
            if (age == st.age) {
                return 0;
            } else if (age < st.age) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return name.compareTo(st.name);
        }
    }
}
