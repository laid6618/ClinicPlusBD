package com.ogtime.clinicplus.dao;

import java.util.List;

import com.ogtime.clinicplus.entities.*;

public interface IPatientDAO {	
	
	public List<Patient> listPatients();
	public List<Patient> patientsParMotCle(String mc);
	
	public Patient getPatient(Long idPatient);
	public void supprimerPatient(Long idPatient);
	public void modifierPatient(Patient patient);	
	public void ajouterPatient(Patient patient);

}
