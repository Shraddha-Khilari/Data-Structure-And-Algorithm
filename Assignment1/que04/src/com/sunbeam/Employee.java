package com.sunbeam;

public class Employee 
{
        int empId;
        String name;
        double salary;

        Employee(int empId, String name, double salary) {
            this.empId = empId;
            this.name = name;
            this.salary = salary;
        }
    
    public static int findById(Employee[] Earr, int feId) 
    {
        for(int i=0;i < Earr.length;i++) 
        {
            if (Earr[i].empId == feId) 
            {
                return i;
            }
        }
        return -1;
    }

   
    public static int findByName(Employee[] Earr, String fName) 
    {
    	for(int i=0;i < Earr.length;i++) 
        {
            if (Earr[i].name == fName) 
            {
                return i;
            }
        }
        return -1;
    }


  
    public static int findBySalary(Employee[] Earr, double fSal) 
    {
    	for(int i=0;i < Earr.length;i++) 
        {
            if (Earr[i].salary == fSal) 
            {
                return i;
            }
        }
        return -1;
    }

}
