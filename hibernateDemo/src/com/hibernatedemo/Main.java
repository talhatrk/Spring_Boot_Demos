package com.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		org.hibernate.SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		//Unit of Work
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			//HQL--> Hibernate Query Language
			//from City c where c.countryCode='TUR' AND c.district='Ankara'
			//from City c where c.name LIKE '%kar%'
			//ASC-Ascending
			//DESC-Descending
			/*
			 * List <String> countryCodes =
			 * session.createQuery("select c.countryCode from City c GROUP BY c.countryCode"
			 * ).getResultList();
			 * 
			 * for(String countryCode:countryCodes) { System.out.println(countryCode); }
			 */
			
			//insert
//			City city= new City();
//			city.setName("D�zce 10");
//			city.setCountryCode("TUR");
//			city.setDistrict("karadeniz");
//			city.setPopulation(100000);
//			
//			session.save(city);
			
			//UPDATE
			/*
			 * City city = session.get(City.class, 4088); city.setPopulation(110000);
			 * 
			 * session.save(city);
			 */
			
			//CRUD Create Read Update Delete
			
			//DELETE
			
			City city = session.get(City.class, 4088);
			session.delete(city);
			
			
			
			session.getTransaction().commit();
			System.out.println("�ehir g�ncellendi");
		}finally {
			factory.close();
		}
	}

}
