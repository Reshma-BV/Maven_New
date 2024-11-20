package exception;

public class CustomException 
{
 public void checkLicense(int age) throws LicenceException
 {
	 if(age<18)
	 {
		 throw new LicenceException("Minor");
	 }
	 else
	 {
		 System.out.println("Eligible for license");
	 }
	
 }
	public static void main(String[] args)
	{
		CustomException customexception=new CustomException();
		try
		{
		customexception.checkLicense(15);
		}
		catch(LicenceException e)
		{
			System.out.println(e);
		}
	}

}
