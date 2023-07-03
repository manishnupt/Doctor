package com.example.Doctor.utility;

import java.util.ArrayList;
import java.util.List;

import com.example.Doctor.entity.Doctor;
import com.example.Doctor.uiRequest.DoctorUiRequest;
import com.example.Doctor.uiResponse.DoctorUiResponse;

public class DoctorHelper {

	public static Doctor convertDoctorUiRequest(DoctorUiRequest req) {
		// TODO Auto-generated method stub
		Doctor d = new Doctor();
		d.setName(req.getName());
		d.setSpeciality(req.getSpeciality());
		d.setStartingHour(req.getStartingHour());
		d.setEndingHour(req.getEndingHour());
		d.setBreakStartHour(req.getBreakStartHour());
		d.setBreakEndHour(req.getBreakEndHour());
		return d;

		//return null;
	}

	public static List<DoctorUiResponse> convertToGetDoctorBySpecialityUiResponse(List<Doctor> doctorsBySpeciality) {
		// TODO Auto-generated method stub
		List<DoctorUiResponse> response = new ArrayList<DoctorUiResponse>();
		for(Doctor d :doctorsBySpeciality)
		{
			DoctorUiResponse doctorUiResponse= new DoctorUiResponse(); 
			doctorUiResponse.setDoctorId(d.getId());
			doctorUiResponse.setDoctorName(d.getName());
			response.add(doctorUiResponse);
			
		}
		
		
		return response;
	}

}


