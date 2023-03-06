public class CS extends Dept
{
	//private int credit;
	
	public CS(String deptName,int creditFee)
	{
		super(deptName,creditFee);
	}
	public void calculateSemesterFee(int credit)
	{
		System.out.println("Semester Fee: "+credit*creditFee);
	}
	
	 
}