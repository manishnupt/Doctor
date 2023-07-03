package com.example.Doctor.businessLogic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Doctor.entity.Doctor;
import com.example.Doctor.service.DoctorService;
import com.example.Doctor.uiRequest.DoctorUiRequest;
import com.example.Doctor.uiResponse.DoctorUiResponse;
import com.example.Doctor.utility.DoctorHelper;

@Component
public class DoctorBl {

	@Autowired
	private DoctorService service;
	
	public String addDoctor(DoctorUiRequest req) {
		// TODO Auto-generated method stub
		Doctor d=DoctorHelper.convertDoctorUiRequest(req);
		return service.addDoctor(d);
	}

	public List<String> getAllSpeciality() {
		// TODO Auto-generated method stub
		return service.getAllSpeciality();
		//return null;
	}

	public List<DoctorUiResponse> getDoctorsBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		
		List<Doctor> doctorsBySpeciality = service.getDoctorsBySpeciality(speciality);
		List<DoctorUiResponse> response =DoctorHelper.convertToGetDoctorBySpecialityUiResponse(doctorsBySpeciality);
		
		return response;
	}



}
