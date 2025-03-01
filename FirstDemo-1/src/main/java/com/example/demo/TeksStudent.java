package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
 public class TeksStudent {
@Id
   private Integer id;
   private String name;
   private String course;

public TeksStudent(Integer id, String name, String course) {
	super();
	this.id = id;
	this.name = name;
	this.course = course;
	

}

public TeksStudent() {
	super();
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

@Override
public String toString() {
	return "TeksStudent [id=" + id + ", name=" + name + ", course=" + course + "]";
}

	

}
