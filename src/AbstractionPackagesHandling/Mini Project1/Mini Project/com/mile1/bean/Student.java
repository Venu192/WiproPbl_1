package com.mile1.bean;
public class Student{
private String name; private int[] marks; private String grade;
public Student(){}
public Student(String name,int[] marks){this.name=name;this.marks=marks;}
public String getName(){return name;} public void setName(String n){name=n;}
public int[] getMarks(){return marks;} public void setMarks(int[] m){marks=m;}
public String getGrade(){return grade;} public void setGrade(String g){grade=g;}
}