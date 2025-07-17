package org.example3.mongoapiexample2.Controller;
import org.example3.mongoapiexample2.model.Students;
import org.example3.mongoapiexample2.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentsController {
	 @Autowired
	    private StudentsService studentService;

	    @PostMapping
	    public Students save(@RequestBody Students student) {
	        return studentService.saveStudent(student);
	    }

	    @GetMapping
	    public List<Students> getAll() {
	        return studentService.getAllStudents();
	    }

	    @GetMapping("/and")
	    public List<Students> getByNameAndAddress(@RequestParam String name, @RequestParam String address) {
	        return studentService.getByNameAndAddress(name, address);
	    }

	    @GetMapping("/or")
	    public List<Students> getByNameOrAddress(@RequestParam String name, @RequestParam String address) {
	        return studentService.getByNameOrAddress(name, address);
	    }

	    @GetMapping("/age/gt")
	    public List<Students> getByAgeGT(@RequestParam int age) {
	        int aged studentService.getByAgeGT(age);
	        return aged;
	    }

	    @GetMapping("/age/lt")
	    public List<Students> getByAgeLT(@RequestParam int age) {
	        return studentService.getByAgeLT(age);
	    }

	    @GetMapping("/cgpa/gt")
	    public List<Students> getByCgpaGT(@RequestParam double cgpa) {
	        return studentService.getByCgpaGT(cgpa);
	    }

	    @GetMapping("/cgpa/lt")
	    public List<Students> getByCgpaLT(@RequestParam double cgpa) {
	        return studentService.getByCgpaLT(cgpa);
	    }
	    @GetMapping("/{id}")
	    public Students getStudentById(@PathVariable String id) {
	        return studentService.getStudentById(id);
	    }
	    
	    @PutMapping("/{id}")
	    public Students updateStudent(@PathVariable String id, @RequestBody Students updatedStudent) {
	        return studentService.updateStudent(id, updatedStudent);
	    }

	    
	    @DeleteMapping("/{id}")
	    public String deleteStudent(@PathVariable String id) {
	        return studentService.deleteStudent(id);
	    }
}
