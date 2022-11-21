package com.HealthCareSystem.dao;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.HealthCareSystem.business.entity.Department;

public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao {

	@Override
	public List<Department> getAllDepartment() {
		String hql = "from Department ORDER BY departmentName ASC";
		List<Department> deptList = getHibernateTemplate().find(hql);
		return deptList.isEmpty() || deptList == null ? null : deptList;
	}

	@Override
	public List<Department> getAvailableDepartment() {

		String hql = "from Department where status=? ORDER BY departmentName ASC";
		List<Department> deptList = getHibernateTemplate().find(hql, "available");
		return deptList.isEmpty() || deptList == null ? null : deptList;

	}

	@Override
	public void saveDept(Department dept) {

		getHibernateTemplate().saveOrUpdate(dept);
	}

	@Override
	public Department getDeptById(Integer deptId) {
		String hql = "from Department i where i.departmentId=?";
		List<Department> deptList = getHibernateTemplate().find(hql, deptId);
		return deptList.isEmpty() || deptList == null ? null : deptList.get(0);
	}

	@Override
	public Department checkName(String deptName) {
		String hql = "from Department i where i.departmentName=?";
		List<Department> deptList = getHibernateTemplate().find(hql, deptName);
		return deptList.isEmpty() || deptList == null ? null : deptList.get(0);
	}

}
