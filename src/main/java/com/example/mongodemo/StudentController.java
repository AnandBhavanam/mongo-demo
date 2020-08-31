package com.example.mongodemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentRepoImpl studentRepoImpl;
	
	@GetMapping("/insert")
	public void insertSudentData()  {
		studentRepoImpl.loadData();
	}
	
//	@GetMapping("/insert")
//	public void insertSudentData()  {
//		studentRepoImpl.loadData();
//	}
	
	@GetMapping(value = "/add-marks", produces = {MediaType.APPLICATION_JSON_VALUE})
	public void insertSubject() {
		studentRepoImpl.addMarks();
	}
}
