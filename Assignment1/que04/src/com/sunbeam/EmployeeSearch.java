package com.sunbeam;

public class EmployeeSearch 
{

	public static void main(String[] args) 
	{
		 Employee Earr[] = {
	                new Employee(1, "Vaihnavi Patil", 65000.0),
	                new Employee(2, "Gayatri Bari", 60000.0),
	                new Employee(3, "Aachal Bhangale", 55000.0)
	        };

	        int feid = 2;
	        int Idindex = Employee.findById(Earr, feid);
	        
	        if (Idindex != -1) 
	        {
	            System.out.println("Employee by id found at index " +Idindex);
	        } 
	        else {
	            System.out.println("Employee by id Not found");
	        }

	        String fname = "Vaihnavi Patil";
	        int nameindex = Employee.findByName(Earr, fname);
	        
	        if (nameindex != -1)
	        {
	            System.out.println("Employee by name found at index "+nameindex);
	        }
	        else {
	            System.out.println("Employee by name Not found");
	        }

	        double fsal = 55000.0;
	        int salindex = Employee.findBySalary(Earr, fsal);
	        
	        if (salindex != -1) 
	        {
	            System.out.println("Employee by salary found at index " + salindex);
	        } 
	        else {
	            System.out.println("Employee by Salary Not found");
	        }
	    }
	}