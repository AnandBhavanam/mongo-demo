package com.example.mongodemo;

import java.util.ArrayList;
import java.util.List;

import org.apache.coyote.http11.Http11AprProtocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StudentRepoImpl {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private MarksRepository marksRepository;
	
	List<Student> all = new ArrayList<>();
	
	public void loadData() {
		for (int i = 1; i < 12; i++) {
			Student s = new Student(Long.valueOf(i), "anand", "cary", "nc");
			all.add(s);
		}
		studentRepository.saveAll(all);
	}
	
	public void addMarks() {
		
		List<Student> allStudents = studentRepository.findAll();
		
		List<Subjects> subs = new ArrayList<>();
		for(Student s : allStudents) {
			
			Subjects sub = new Subjects(s.getId(),s.getName(), s);
			
			subs.add(sub);
		}
		marksRepository.saveAll(subs);
	}
	
	
}
