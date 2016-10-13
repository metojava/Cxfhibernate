package org.tut.test;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.tut.model.User;

public class SessionFactoryUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		sessionFactory = null;
		try {
			Properties prop = new Properties();
			prop.setProperty("hibernate.dialect",
					"org.hibernate.dialect.MySQLDialect");

			prop.setProperty("hibernate.connection.driver_class",
					"com.mysql.jdbc.Driver");

			prop.setProperty("hibernate.connection.url",
					"jdbc:mysql://localhost/test");

			prop.setProperty("hibernate.connection.username", "root");

			prop.setProperty("hibernate.connection.password", "nbuser");
			sessionFactory = new AnnotationConfiguration().addProperties(prop).configure()
					.addAnnotatedClass(User.class).buildSessionFactory();
		} catch (Throwable ex) {
			ex.printStackTrace();
		}
		return sessionFactory;
	}

}
