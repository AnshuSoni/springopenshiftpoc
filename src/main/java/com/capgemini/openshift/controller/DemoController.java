package com.capgemini.openshift.controller;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.openshift.models.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.openshift.models.Employee;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1")
public class DemoController {

	@GetMapping(value = "employees")
	public ResponseEntity<List<Employee>> getEmployees(){
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Abhishek", 23, 30000.0));
		emps.add(new Employee("Chandan", 24, 60000.0));
		emps.add(new Employee("Rajkumar", 22, 20000.0));
		emps.add(new Employee("Iphone", 26, 40000.0));
		return new ResponseEntity<List<Employee>>(emps, HttpStatus.OK);
	}

	@GetMapping(value = {"cars", "/", "car21", "/api/v1/cars24"})
	public ResponseEntity<List<Car>> getCars(){
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Swift Dezire", "800 cc"));
		cars.add(new Car("Polo Vento", "1200 cc"));
		cars.add(new Car("Jeep Compass", "1400 cc"));
		cars.add(new Car("Tata Harrier", "1800 cc"));
		cars.add(new Car("Land Rovers", "2000 cc"));
		return new ResponseEntity<>(cars, HttpStatus.OK);
	}
	@GetMapping(value = {"name"})
	public ResponseEntity<String> name(){
		return new ResponseEntity<>("Rajnikant", HttpStatus.OK);
	}
}
