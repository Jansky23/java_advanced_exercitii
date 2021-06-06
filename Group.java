package com.sda.SDASCheduleAPP;

import java.util.List;

public class Group {
     private String name;
     private Trainer trainer;
     private List<Student> studentList;


     public Group(){

     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public Trainer getTrainer() {
          return trainer;
     }

     public void setTrainer(Trainer trainer) {
          this.trainer = trainer;
     }

     public List<Student> getStudentList() {
          return studentList;
     }

     public void setStudentList(List<Student> studentList) {
          this.studentList = studentList;
     }
}
