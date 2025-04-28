package com.linkfields.Orm;

import java.util.Scanner;

public class UserRegistryCLI {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        UserService service = new UserService();

	        while (true) {
	            System.out.println("\n=== User Registry ===");
	            System.out.println("1. Add user");
	            System.out.println("2. List users");
	            System.out.println("3. Remove user");
	            System.out.println("4. Exit");
	            System.out.print("Choice: ");

	            String input = scanner.nextLine();

	            switch (input) {
	                case "1" -> {
	                    System.out.print("Enter name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter email: ");
	                    String email = scanner.nextLine();
	                    service.addUser(name, email);
	                    System.out.println("User added.");
	                }
	                case "2" -> service.listUsers();
	                case "3" -> {
	                    System.out.print("Enter email to remove: ");
	                    String email = scanner.nextLine();
	                    service.removeUser(email);
	                }
	                case "4" -> {
	                    System.out.println("Bye!");
	                    return;
	                }
	                default -> System.out.println("Invalid option. Try again.");
	            }
	           
	        }
	        
	    }
	}


