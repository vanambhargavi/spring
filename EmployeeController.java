package com.axis.Controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 
import com.axis.model.Employee;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	ArrayList<Employee> employees =new
	ArrayList<Employee>(); 
	public EmployeeController() { 
		employees.add(new Employee()); 
		employees.add(new Employee());
		employees.add(new Employee()); }
	@GetMapping("/getEmployees")
	public List<Employee>
	getAllEmployees(){
		return employees; }
	@PostMapping("/addEmployee") 
	public String addEmployee(@RequestBody Employee employee) { 
		employees.add(employee); 
		return "employee added"; } }




