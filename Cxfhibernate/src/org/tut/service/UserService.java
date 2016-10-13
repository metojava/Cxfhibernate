package org.tut.service;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import org.tut.dao.UserUtil;
import org.tut.model.User;

@WebService(targetNamespace = "http://service.tut.org/", portName = "UserServicePort", serviceName = "UserServiceService")
public class UserService {

	private UserUtil eu;

	public UserUtil getEu() {
		return eu;
	}

	public void setEu(UserUtil eu) {
		this.eu = eu;
	}

	public UserService() {
		eu = new UserUtil();
	}

	public UserService(UserUtil eu) {
		this.eu = eu;
	}

	public User getUser(int id) {
		return eu.getUser(id);
	}

	public List<User> getUsers() {
		return eu.getUsers();
	}

	public Integer createUser(int id, String firstName, String lastName,
			double salary, int age, Date bdate) {
		return eu.createUser(id, firstName, lastName, salary, age, bdate);
	}

	public void deleteUser(int id) {
		eu.deleteUser(id);
	}
}
