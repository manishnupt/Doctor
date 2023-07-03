package com.example.Doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Doctor.entity.Doctor;
import com.example.Doctor.repository.DoctorRepo;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepo repo;

	public List<String> getAllSpeciality() {
		List<String> listOfSpeciality =repo.getAllSpeciality();
		
		// TODO Auto-generated method stur
		return listOfSpeciality;
		
		
	}

	public String addDoctor(Doctor d) {
		// TODO Auto-generated method stub
		
		Doctor doctor =repo.save(d);
		if(doctor!=null)
		{
			return "Success";
		}
		return "Failure";
	}

	public List<Doctor> getDoctorsBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		List<Doctor> listOfDoctor = repo.getDoctorsBySpeciality(speciality);
		return listOfDoctor;
		
	}
	
	

}
