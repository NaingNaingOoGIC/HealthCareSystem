package com.HealthCareSystem.dao;

import java.util.List;
import com.HealthCareSystem.business.entity.PatientProgress;

public interface ProgressDao {

	public PatientProgress getProgbyId(int id);

	public List<PatientProgress> getProgListByStatus(String status);

	public void saveProg(PatientProgress reqPrgo);

	public List<PatientProgress> getAllProg();
}
