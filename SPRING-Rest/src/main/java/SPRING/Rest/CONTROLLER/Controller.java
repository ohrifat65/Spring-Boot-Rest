package SPRING.Rest.CONTROLLER;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import SPRING.Rest.MODEL.*;

import SPRING.Rest.REPOSITORY.CourseRepo;
import SPRING.Rest.REPOSITORY.StudentRepo;

@RestController
public class Controller {

	@Autowired
	StudentRepo sRepo;

	@Autowired
	CourseRepo cRepo;

	@GetMapping("/student")
	public String hello() {

		return "Hello RestFull Api";
	}

	// --------Get All Student---------

	@GetMapping("/student/all")
	public List<Student> AllStudent() {
		return sRepo.findAll();
	}

	// -------Get Student by ID--------

	@GetMapping("/student/{id}")
	public Optional<Student> StudentById(@PathVariable("id") int id) {
		return sRepo.findById(id);
	}

	// --------Get All Course---------

	@GetMapping("/course/all")
	public List<Course> AllCourse() {
		return cRepo.findAll();
	}

	// --------Get Course by ID---------

	@GetMapping("/course/{id}")
	public Optional<Student> CourseById(@PathVariable int id) {
		return sRepo.findById(id);
	}

	// --------Update---------

	@PostMapping("/update/student")
	public Student updateStudent(@RequestBody Student student) {
		return sRepo.save(student);
	}
	@PostMapping("/update/course")
	public Course updateCourse(@RequestBody Course course) {
		return cRepo.save(course);
	}
	// -------Delete--------

	@GetMapping("/delete/student/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		try {
			sRepo.deleteById(id);
			return "Successfully Deleted";
		} catch (Exception e) {
			return "Deleting Failed";
		}
	}
	
	@GetMapping("/delete/course/{id}")
	public String deleteCourse(@PathVariable("id") int id) {
		try {
			cRepo.deleteById(id);
			return "Successfully Deleted";
		} catch (Exception e) {
			return "Deleting Failed";
		}
	}
}
