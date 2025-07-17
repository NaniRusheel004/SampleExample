package org.example3.mongoapiexample2.service;

import java.util.List;

import org.example3.mongoapiexample2.model.Students;
import org.example3.mongoapiexample2.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
@Service
public class StudentsService {
	@Autowired
    private StudentsRepository studentRepository;

    public Students saveStudent(Students student) {
        return studentRepository.save(student);
    }

    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }
    @Cacheable(value = "students", key = "#id")
    public Students getStudentById(String id) {
        System.out.println("Fetching from MongoDB for ID: " + id);  
        return studentRepository.findById(id).orElse(null);
    }
    public List<Students> getByNameAndAddress(String name, String address) {
        return studentRepository.findByNameAndAddress(name, address);
    }

    public List<Students> getByNameOrAddress(String name, String address) {
        return studentRepository.findByNameOrAddress(name, address);
    }

    public List<Students> getByAgeGT(int age) {
        return studentRepository.findByAgeGreaterThan(age);
    }

    public List<Students> getByAgeLT(int age) {
        return studentRepository.findByAgeLessThan(age);
    }

    public List<Students> getByCgpaGT(double cgpa) {
        return studentRepository.findByCgpaGreaterThan(cgpa);
    }

    public List<Students> getByCgpaLT(double cgpa) {
        return studentRepository.findByCgpaLessThan(cgpa);
    }
    @CacheEvict(value = "students", key = "#id")
    public Students updateStudent(String id, Students updatedStudent) {
        Students existing = studentRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updatedStudent.getName());
            existing.setAge(updatedStudent.getAge());
            existing.setPhone(updatedStudent.getPhone());
            existing.setAddress(updatedStudent.getAddress());
            existing.setCgpa(updatedStudent.getCgpa());
            return studentRepository.save(existing);
        }
        return null;
    }
    @CacheEvict(value = "students", key = "#id")
    public String deleteStudent(String id) {
        studentRepository.deleteById(id);
        return "Student with ID " + id + " deleted successfully.";
    }

}
