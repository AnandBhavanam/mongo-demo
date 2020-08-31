package com.example.mongodemo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "subjects")
@Data
@NoArgsConstructor
public class Subjects {
	
	@Id
	private Long id;
	private String name;
	private Student Student;
	
	public Subjects(Long id, String name, com.example.mongodemo.Student s) {
		super();
		this.id = id;
		this.name = name;
		Student = s;
	}
	
	

	
}
