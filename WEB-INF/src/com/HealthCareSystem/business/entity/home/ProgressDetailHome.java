package com.HealthCareSystem.business.entity.home;
// Generated Jul 23, 2022, 6:48:25 PM by Hibernate Tools 4.3.6.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.HealthCareSystem.business.entity.ProgressDetail;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class ProgressDetail.
 * @see com.HealthCareSystem.business.entity.ProgressDetail
 * @author Hibernate Tools
 */
public class ProgressDetailHome {

	private static final Log log = LogFactory.getLog(ProgressDetailHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ProgressDetail transientInstance) {
		log.debug("persisting ProgressDetail instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ProgressDetail instance) {
		log.debug("attaching dirty ProgressDetail instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ProgressDetail instance) {
		log.debug("attaching clean ProgressDetail instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ProgressDetail persistentInstance) {
		log.debug("deleting ProgressDetail instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ProgressDetail merge(ProgressDetail detachedInstance) {
		log.debug("merging ProgressDetail instance");
		try {
			ProgressDetail result = (ProgressDetail) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProgressDetail findById(java.lang.Integer id) {
		log.debug("getting ProgressDetail instance with id: " + id);
		try {
			ProgressDetail instance = (ProgressDetail) sessionFactory.getCurrentSession()
					.get("com.HealthCareSystem.business.entity.ProgressDetail", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<ProgressDetail> findByExample(ProgressDetail instance) {
		log.debug("finding ProgressDetail instance by example");
		try {
			List<ProgressDetail> results = (List<ProgressDetail>) sessionFactory.getCurrentSession()
					.createCriteria("com.HealthCareSystem.business.entity.ProgressDetail").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
