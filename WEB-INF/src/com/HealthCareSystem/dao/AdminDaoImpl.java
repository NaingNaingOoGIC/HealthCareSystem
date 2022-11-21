package com.HealthCareSystem.dao;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.HealthCareSystem.business.entity.Admin;

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {

	@Override
	public Admin getAdmin(String userName, String password) {

		String hql = "from Admin i where i.adminLoginName=? and i.password=?";
		Object[] param = { userName, password };
		List l = getHibernateTemplate().find(hql, param);
		return l.isEmpty() || l == null ? null : (Admin) l.get(0);

	}

	@Override
	public void saveAdmin(Admin myAdmin) {
		getHibernateTemplate().saveOrUpdate(myAdmin);

	}

	@Override
	public int countAdmin() {

		String hql = "from Admin";
		List count = getHibernateTemplate().find(hql);
		return count.size();
	}

}
