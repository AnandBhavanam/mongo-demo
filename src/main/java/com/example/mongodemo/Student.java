package com.example.mongodemo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "student")
@Data
@NoArgsConstructor
public class Student {

	public Student(String name, String city, String state) {
		this.name = name;
		this.city = city;
		this.state = state;
	}

	@Id
	private Long id;
	private String name;
	private String city;
	private String state;
	
	public Student(Long id, String name, String city, String state) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
	}
	
	
	
}
