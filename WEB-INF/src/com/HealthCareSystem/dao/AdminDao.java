package com.HealthCareSystem.dao;

import com.HealthCareSystem.business.entity.Admin;

public interface AdminDao {

	public Admin getAdmin(String userName, String password);

	public void saveAdmin(Admin myAdmin);

	public int countAdmin();

}
