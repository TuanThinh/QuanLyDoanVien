package mta.qldv.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HibernateUtil {

	@Autowired
	private SessionFactory sessionFactory;

	private Session session;

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getCurrentSession() {
		try {
			session = this.sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = this.sessionFactory.openSession();
		}
		return session;
	}
}
