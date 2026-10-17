/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author macbook
 */
class Student implements Comparable<Student>
{
    String name;
    int age;
    
    public Student(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.age ==o.age)
        {
            return this.name.compareTo(o.name);
        }
        else
        {
            return this.age-o.age;
        }
    }
    
}
public class SortObject {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        
        students.add(new Student("Mya Mya",30));
        students.add(new Student("Hla Hla",20));
        students.add(new Student("Aung Myin",13));
        students.add(new Student("Win Win",25));
        students.add(new Student("Aung Khin",20));
        
        Collections.sort(students);
        
        /*
        students.sort((a,b)->{
            if(a.age==b.age)
            {
                return a.name.compareTo(b.name);
            }
            else
            {
                return a.age-b.age;
            }
        });
        */
        for(Student std: students)
        {
            System.out.println(std);
        }
        List<Student> subList = students.subList(0, 3);
        for(Student std: subList)
        {
            System.out.println("Sublist "+std);
        }
    }
}
