package com.example.Doctor.uiRequest;

import java.time.LocalDate;
import java.time.LocalTime;

public class DoctorScheduleUiRequest {
	
	private LocalDate date;
	private int doctorId;
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	
	
	
	
	

}
