package com.linkfields.Orm;
import java.util.ArrayList;
import java.util.List;

public class UserService {
	    private List<User> users = new ArrayList<>();

	    public void addUser(String name, String email) {
	        users.add(new User(name, email));
	    }

	    public void listUsers() {
	        if (users.isEmpty()) {
	            System.out.println("No users yet.");
	            return;
	        }

	        for (User user : users) {
	            System.out.println("- " + user);
	        }
	    }

	    public void removeUser(String email) {
	        boolean removed = users.removeIf(u -> u.getEmail().equalsIgnoreCase(email));
	        if (removed) {
	            System.out.println("User removed.");
	        } else {
	            System.out.println("User not found.");
	        }
	    }
	}

