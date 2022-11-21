package com.HealthCareSystem.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.HealthCareSystem.business.entity.PatientProgress;

public class ProgressDaoImpl extends HibernateDaoSupport implements ProgressDao {

	@Override
	public PatientProgress getProgbyId(int id) {

		String hql = "from PatientProgress i where i.progressId=?";
		List prog = getHibernateTemplate().find(hql, id);
		return prog.isEmpty() || prog == null ? null : (PatientProgress) prog.get(0);

	}

	@Override
	public List<PatientProgress> getProgListByStatus(String status) {
		String hql = "from PatientProgress i where i.status=?";
		List progList = getHibernateTemplate().find(hql, status);
		return progList.isEmpty() || progList == null ? null : progList;
	}

	@Override
	public void saveProg(PatientProgress reqPrgo) {
		getHibernateTemplate().saveOrUpdate(reqPrgo);
	}

	@Override
	public List<PatientProgress> getAllProg() {
		String hql = "from PatientProgress";
		List resultList = getHibernateTemplate().find(hql);
		return resultList.isEmpty() || resultList == null ? null : resultList;
	}

}
