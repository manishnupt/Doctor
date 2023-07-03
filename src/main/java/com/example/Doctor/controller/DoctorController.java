package com.example.Doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Doctor.businessLogic.DoctorBl;
import com.example.Doctor.uiRequest.DoctorScheduleUiRequest;
import com.example.Doctor.uiRequest.DoctorUiRequest;
import com.example.Doctor.uiResponse.DoctorUiResponse;
import com.example.Doctor.uiResponse.SchedueUiResponse;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
	
//addDoctor
//checkDoctorAvaibility
//manageDoctorTiming

	
	@Autowired
	private DoctorBl bl;
	
	
	@PostMapping("/addDoctor")
	public String addDoctor(@RequestBody DoctorUiRequest req)
	{
		return bl.addDoctor(req);
		//return null;
	}
	
	@GetMapping("/getAllSpeciality")
	public List<String> getAllSpeciality()
	{
		return bl.getAllSpeciality();
	}
	
	@GetMapping("/getDoctorBySpeciality/{speciality}")
	public List<DoctorUiResponse> getDoctorsBySpeciality(@PathVariable String speciality)
	{
		return bl.getDoctorsBySpeciality(speciality);
	}
	
	
}
