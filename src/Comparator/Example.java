package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", 25));
        studentList.add(new Student("Alice", 22));
        studentList.add(new Student("Bob",30));

        //Sortering using a Comparator

        Collections.sort(studentList, new Comparator<Student>() {
         public int compare(Student s1, Student s2) {
             //Compare by age

             return Integer.compare(s1.age, s2.age);

         }
        });
        //Display sorted list
        for (Student student: studentList) {
            System.out.println(student.name + " - " + student.age + "Years old");


        }
    }
}
