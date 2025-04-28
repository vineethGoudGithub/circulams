package com.linkfields.orm.Controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linkfields.orm.entity.User;

	@RestController
	@RequestMapping("/api/users")
    public class UserController {

		private final List<User> users = new ArrayList<>();

		@GetMapping
		public List<User> getAllUsers() {
			return users;
		}

		@PostMapping
		public String addUser(@RequestBody User user) {
			users.add(user);
			return "User added successfully";
		}
	}


