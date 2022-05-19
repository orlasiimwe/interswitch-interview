package Interswitch.Interswitch.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Interswitch.Interswitch.entities.User;
import Interswitch.Interswitch.services.RoleService;
import Interswitch.Interswitch.services.UserService;

@RestController
@RequestMapping(path = "/users")

public class UserController {
	private final UserService userService;


	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@PostMapping
	public void addEmployee(@RequestBody User user) {
		userService.createUser(user);
	}
}
