package com.oopsAssignment;

public class HRDepartment extends SuperDepartment {
	public String departmentName() {
		String departmentName = "HR Department";
		return departmentName;
	}
	public String getTodaysWork() {
		String getTodaysWork = "Fill today’s worksheet and mark your attendance";
		return getTodaysWork;
	}
	public String getWorkDeadline() {
		String getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}
	public String doActivity() {
		String doActivity = "team Lunch";
		return doActivity;		
	}
}
