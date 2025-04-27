package com.linkfields.Day7_CustomerComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerDetails {

	    public static void main(String[] args) {
	        List<Person> people = new ArrayList<>();
	        people.add(new Person("Alice", 30));
	        people.add(new Person("Bob", 25));
	        people.add(new Person("Charlie", 35));
	        people.add(new Person("David", 25));

	        // Sort by age (ascending), then by name (alphabetically)
	        Collections.sort(people, new Comparator<Person>() {
	            @Override
	            public int compare(Person p1, Person p2) {
	                if (p1.getAge() != p2.getAge()) {
	                    return Integer.compare(p1.getAge(), p2.getAge());
	                }
	                return p1.getName().compareTo(p2.getName());
	            }
	        });

	        System.out.println("Sorted list:");
	        for (Person person : people) {
	            System.out.println(person);
	        }
	        //need TO CHeck More on this Problem
	    }
}
