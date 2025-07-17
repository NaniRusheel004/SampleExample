package org.example3.mongoapiexample2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="students")

public class Students {
	@Id 
	 private String id;
	 private String name;
	 private int age;
     private String phone;
     private String address;
     private double cgpa;
	
	 public Students() {
	 }
	 public Students(String id, String name, int age, String phone, String address, double cgpa) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.phone = phone;
	        this.address = address;
	        this.cgpa = cgpa;
	    }
	 public String getId() {
		 return id;
	 }
	 public void setId(String id) {
		 this.id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 this.age = age;
	 }
	 public String getPhone() {
		 return phone;
	 }
	 public void setPhone(String phone) {
		 this.phone = phone;
	 }
	 public String getAddress() {
		 return address;
	 }
	 public void setAddress(String address) {
		 this.address = address;
	 }
	 public double getCgpa() {
		 return cgpa;
	 }
	 public void setCgpa(double cgpa) {
		 this.cgpa = cgpa;
	 }
	 @Override
	    public String toString() {
	        return "Student{" +
	            "id='" + id + '\'' +
	            ", name='" + name + '\'' +
	            ", age=" + age +
	            ", phone='" + phone + '\'' +
	            ", address='" + address + '\'' +
	            ", cgpa=" + cgpa +
	            '}';
	 }
     
}
