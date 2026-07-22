package com.mile1.main;
import com.mile1.bean.*; import com.mile1.service.*;
public class StudentMain{
static Student[] data=new Student[4];
public StudentMain(){
data[0]=new Student("Sekar",new int[]{85,75,95});
data[1]=new Student(null,new int[]{11,22,33});
data[2]=null;
data[3]=new Student("Manoj",null);
}
public static void main(String[] args){
new StudentMain();
StudentReport r=new StudentReport();
for(Student s:data){
try{
if(r.validate(s).equals("VALID"))
System.out.println(r.findGrades(s));
}catch(Exception e){e.printStackTrace();}
}
StudentService ss=new StudentService();
System.out.println(ss.findNumberOfNullMarksArray(data));
System.out.println(ss.findNumberOfNullName(data));
System.out.println(ss.findNumberOfNullObjects(data));
}
}