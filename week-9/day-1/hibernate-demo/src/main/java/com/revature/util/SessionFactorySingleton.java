package com.revature.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactorySingleton {

	private static SessionFactory sf;
	
	public static SessionFactory getSessionFactory() {
		if (sf == null) {
			Configuration config = new Configuration();
			config.setProperty("hibernate.connection.username", System.getenv("db_username")); // Utilizing environment variables
			// so that we don't have the database username and password hardcoded into our application code
			config.setProperty("hibernate.connection.password", System.getenv("db_password"));
			config.configure("hibernate.cfg.xml");
			
			sf = config.buildSessionFactory();
		}
		
		return sf;
	}
	
}
