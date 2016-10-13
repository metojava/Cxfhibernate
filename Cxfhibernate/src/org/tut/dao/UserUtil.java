package org.tut.dao;

import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.tut.model.User;

public class UserUtil {

	private static SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
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
			sessionFactory = new AnnotationConfiguration()
					.addPackage("org.tut.model").addProperties(prop)
					.addAnnotatedClass(User.class).buildSessionFactory();
		} catch (Throwable ex) {
			ex.printStackTrace();
		}
		return sessionFactory;
	}

	public User getUser(int id) {
		User emp = null;
		try {
			Session session = getSessionFactory().openSession();
			session.beginTransaction();
			emp = (User) session.get(User.class, id);
			session.getTransaction().commit();
		} catch (Exception e) {
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return emp;
	}

	public List<User> getUsers() {
		List<User> users = null;
		try {
			Session session = getSessionFactory().openSession();
			session.beginTransaction();
			users = (List<User>) session.createQuery("from User").list();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	public Integer createUser(int id, String firstName, String lastName, double salary,
			int age, Date bdate) {

		int res = 0;
		User user = new User(id, firstName, lastName, salary,
				 age,  bdate);

		try {
			Session session = getSessionFactory().openSession();
			session.beginTransaction();
			res = (Integer) session.save(user);
			System.out.println("User created");
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

	public void deleteUser(int id) {
		try {
			Session session = getSessionFactory().openSession();
			session.beginTransaction();
			User user = (User) session.get(User.class, id);
			session.delete(user);
			System.out.println("User removed with id -" + id);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
