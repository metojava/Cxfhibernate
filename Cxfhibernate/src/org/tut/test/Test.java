package org.tut.test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.tut.model.User;
import org.tut.service.UserService;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress("http://localhost:8080/Cxfhibernate/services/UserServicePort");
		factory.setServiceClass(UserService.class);
		UserService es = (UserService) factory.create();
		try {
			User user = es.getUser(1);
			System.out.println(user.getFirstName());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
