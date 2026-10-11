/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author macbook
 */
public class ReduceDemo3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        
        students.add(new Student("Mya Mya",Gender.Female,35));
        students.add(new Student("Maung Mya",Gender.Male,25));
        students.add(new Student("Win Win",Gender.Female,15));
        students.add(new Student("Kyaw Zwar",Gender.Male,20));
        students.add(new Student("Aung Win",Gender.Male,28));
        
        Optional<String> youngest = students.parallelStream()
                                            .filter(stud->stud.gender==Gender.Female)
                                            .reduce((studA,studB)-> studA.age< studB.age? studA:studB)
                                            .map(stud->stud.name);
        
        System.out.println("Youngest "+youngest.get());
    }
}
