package com.good.lambda.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseUsingLambda {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thamas", "Carlyles", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mattew", "Arnold", 39)
        );
        //Sort list by last name using lambda
        Collections.sort(people,(p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        //Print person after sort using lambda
        printlastnameconditional(people,(p)->true);
        //Create a method that print all people that have last nam e beginning with C using lambda
        printlastnameconditional(people,(p)->p.getLastName().startsWith("C"));

    }
    //Predicate is from java.util.function package, it is a interface you can use directly without create a new interface
    private static void printlastnameconditional(List<Person> people, Predicate<Person> predicate) {
        for(Person p: people){
            if(predicate.test(p)){
                System.out.println(p);
            }

        }
    }
}


