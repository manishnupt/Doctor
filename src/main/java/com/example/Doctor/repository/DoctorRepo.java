package com.example.Doctor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Doctor.entity.Doctor;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Integer> {
	
	@Query("SELECT DISTINCT d.speciality FROM Doctor d")
	List<String> getAllSpeciality();

	
    @Query("SELECT d FROM Doctor d WHERE d.speciality = :speciality")
	List<Doctor> getDoctorsBySpeciality(@Param("speciality") String speciality);

}
