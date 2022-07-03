package app;

import model.*;
//import model.AdminDept;
//import model.HRDept;
//import model.TechDept;

public class ZApp {

	public static void main(String[] args) 
	{
		AdminDept admin = new AdminDept();
		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println("");
		
		HRDept hr = new HRDept();
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("");

		TechDept tech = new TechDept();
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		System.out.println("");
		
	}
}
