package excelread;

public class ExcelMain 
{

	public static void main(String[] args) 
	{
		try
		{
		System.out.println(ExcelRead.readIntegerData(1, 0));
		System.out.println(ExcelRead.readStringData(1, 1));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
