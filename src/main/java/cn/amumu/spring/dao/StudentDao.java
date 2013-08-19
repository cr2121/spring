package cn.amumu.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void loadProductsByCategory(String category) {
		List list = this.sessionFactory.getCurrentSession()
				.createQuery("from Student").list();
		for (Object o : list) {
			System.out.println(o);
		}
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}