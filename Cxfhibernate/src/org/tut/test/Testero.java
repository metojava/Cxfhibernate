package org.tut.test;

import org.tut.service.UserService;

public class Testero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserService es = new UserService();
		System.out.println(es.getUser(1).getFirstName());

	}

}
