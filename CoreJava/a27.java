class A
{
	public static void main(String args[])
	{
		int ccNo= 23456;
		double amount = 450000.50;
		String studId = "1234";
		String sal = "455000.450";
		
		Integer studIdW = Integer.parseInt(studId);
		Integer ccNoW = ccNo; // autoboxing/auto inboxing
		
		int newCCNo = ccNoW; // auto outboxing 
		
		System.out.println("CC No :"+ccNo);
		System.out.println("CC No :"+ccNoW);
		System.out.println("CC No :"+newCCNo);
		System.out.println("Amount :"+amount);
		
		System.out.println(studId+1234); // concatination
		System.out.println(studIdW+1234); // addition
		
		System.out.println("Salary :"+Double.parseDouble(sal));	
	}
}

