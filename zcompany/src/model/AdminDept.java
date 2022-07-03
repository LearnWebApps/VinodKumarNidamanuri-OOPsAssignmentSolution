package model;

public class AdminDept extends Department{

	public AdminDept()
	{
		super();
	}
	
	public String departmentName()
	{
		return "Admin Department";
	}
	
	public String getTodaysWork ()
	{
		return "Complete your documents Submission";
	}

	public String getWorkDeadline ()
	{
		return "Complete by EOD";
	}

}	
