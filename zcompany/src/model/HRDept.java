package model;

public class HRDept extends Department{

	public String departmentName()
	{
		return("Hr Department");
	}
	
	public String getTodaysWork ()
	{
		return("Fill todays worksheet and mark your attendance");
	}

	public String getWorkDeadline ()
	{
		return("Complete by EOD");
	}
	
	public String doActivity ()
	{
		return("team Lunch");
	}

}
