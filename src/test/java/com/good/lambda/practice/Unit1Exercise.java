package com.good.lambda.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {
    public static void main(String[] args){
     List<Person> people = Arrays.asList(
             new Person("Charles","Dickens",60),
             new Person("Lewis","Carroll",42),
             new Person("Thamas","Carlyles",51),
             new Person("Charlotte","Bronte",45),
             new Person("Mattew","Arnold",39)
     );

             //Step 1: Sort list by lastname
             //non lambda
             Collections.sort(people, new Comparator<Person>() {
                 @Override
                 public int compare(Person o1, Person o2) {
                     return o1.getLastName().compareTo(o2.getLastName());
                 }
             });
             //Step 2: Create a method that prints all elements in the list
             //non lambda
        printAll(people);  

             //Step 3: Create a method that prints all people that have last name beginning with C
             //non lambda
        printlastnameconditional(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

    }

    private static void printlastnameconditional(List<Person> people,Condition condition) {
        for(Person p: people){
            if(condition.test(p)){
                System.out.println(p);
            }

        }
    }

    private static void printAll(List<Person> people) {
        for(Person p: people){
            System.out.println(p);
        }

    }
}
interface Condition{
    boolean test(Person p);
        }
