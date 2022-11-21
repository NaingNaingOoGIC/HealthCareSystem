package com.HealthCareSystem.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.HealthCareSystem.business.entity.Patient;

public class PatientDaoImpl extends HibernateDaoSupport implements PatientDao {

	@Override
	public Patient getPatient(String userName, String password) {

		String hql = "from Patient i where i.patientLoginName=? and i.password=?";
		Object[] param = { userName, password };
		List l = getHibernateTemplate().find(hql, param);
		return l.isEmpty() || l == null ? null : (Patient) l.get(0);
	}

	@Override
	public void savePatient(Patient myPatient) {
		getHibernateTemplate().saveOrUpdate(myPatient);
	}

	@Override
	public List<Patient> getReqPatient() {
		String hql = "from Patient where patientLoginName is null";
		List<Patient> reqPatietnt = getHibernateTemplate().find(hql);
		return reqPatietnt.isEmpty() || reqPatietnt == null ? null : reqPatietnt;
	}

	@Override
	public List<Patient> getPatientAcc() {
		String hql = "from Patient where patientLoginName is not null ORDER BY patientLoginName ASC";
		List count = getHibernateTemplate().find(hql);
		List<Patient> patietntAcc = getHibernateTemplate().find(hql);
		return patietntAcc.isEmpty() || patietntAcc == null ? null : patietntAcc;
	}

	@Override
	public Patient getPatientById(int patientId) {
		String hql = "from Patient i where i.patientId=?";
		List patient = getHibernateTemplate().find(hql, patientId);
		return patient.isEmpty() || patient == null ? null : (Patient) patient.get(0);
	}

	@Override
	public Patient getPatientbyEmail(String mail) {
		String hql = "from Patient i where i.mail=?";
		List l = getHibernateTemplate().find(hql, mail);
		return l.isEmpty() || l == null ? null : (Patient) l.get(0);

	}

	@Override
	public Patient getPatientbyEmailAndId(String email, Integer patientId) {
		String hql = "from Patient i where i.mail=? and not i.patientId=?";
		Object[] param = { email, patientId };
		List l = getHibernateTemplate().find(hql, param);
		return l.isEmpty() || l == null ? null : (Patient) l.get(0);

	}

	@Override
	public int getLatestId() {
		String getLast = "from Patient i ORDER BY patientId DESC WHERE ROWNUM <=1";
		List l = getHibernateTemplate().find(getLast);
		Patient p = (Patient) l.get(0);
		int id = p.getPatientId();
		return id;
	}

}
