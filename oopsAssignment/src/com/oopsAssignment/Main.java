package com.oopsAssignment;

public class Main {

	public static void main(String[] args) {
		AdminDepartment AdminDep = new AdminDepartment();
		System.out.println("Welcome to " + AdminDep.departmentName());
		System.out.println(AdminDep.getTodaysWork());
		System.out.println(AdminDep.getWorkDeadline());
		System.out.println(AdminDep.isTodayAHoliday());
	
		HRDepartment HRDep = new HRDepartment();
		System.out.println("\n" + "Welcome to " + HRDep.departmentName());
		System.out.println(HRDep.doActivity());
		System.out.println(HRDep.getTodaysWork());
		System.out.println(HRDep.getWorkDeadline());
		System.out.println(HRDep.isTodayAHoliday());
		
		TechDepartment TechDep = new TechDepartment();
		System.out.println("\n" + "Welcome to " + TechDep.departmentName());
		System.out.println(TechDep.getTodaysWork());
		System.out.println(TechDep.getWorkDeadline());
		System.out.println(TechDep.getTechStackInformation());
		System.out.println(TechDep.isTodayAHoliday());
	}

}
