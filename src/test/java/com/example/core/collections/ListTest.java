package com.example.core.collections;

import lombok.ToString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class ListTest {

private List<Student> students =  new ArrayList<>();
Comparator<Student> compareByName = Comparator.comparing(Student::getFname);
Comparator<Student> compareByCGPA = Comparator.comparing(Student::getCgpa);
Comparator<Student> compareByID = Comparator.comparing(Student::getId);


@BeforeEach
public void init(){


    students.add( new Student(5,"Juca",40.00));
    students.add( new Student(4,"Daniel",30.00));
    students.add( new Student(3,"Thiago",60.00));
    students.add( new Student(2,"Daniel",70.00));
    students.add( new Student(1,"Alice",40.00));



}

@Test
 void has2hCode (){

}
@Test

public void CompareByCGPADescByFNameByID(){

    Collections.sort(students,compareByCGPA.reversed().thenComparing(compareByName.thenComparing(compareByID)));

    System.out.println(students);
// or
//    students.stream()
//            .sorted(compareByCGPA.reversed().thenComparing(compareByName.thenComparing(compareByID)))
//            .forEach(System.out::println);

}

/*
You are given a list of student information: ID, FirstName, and CGPA.
Your task is to rearrange them according to their CGPA in decreasing order.
If two student have the same CGPA, then arrange them according to their first name in alphabetical order.
If those two students also have the same first name, then order them according to their ID.
No two students have the same ID.
*/

    @ToString

    class Student implements Comparable <Student>{
        private int id;
        private String fname;
        private double cgpa;
        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFname() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }

        public int compareTo(Student other){
            if ( this.getCgpa() != other.getCgpa()) {
                return  Double.compare(other.getCgpa(),this.getCgpa());
            }
            else if (!Objects.equals(this.fname, other.getFname())){
                return this.fname.compareTo(other.getFname());
            }

            return Integer.compare(this.id, other.getId());
        }
    }
}
