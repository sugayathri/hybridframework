package testngPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import exceldata.WithoutHardcodingData;

public class ExcelDataProvider {
	
	public static Object[][] testdata(String excelPath,String sheetName)
	{
		WithoutHardcodingData excel=new WithoutHardcodingData(excelPath, sheetName);
	int rowcount=excel.getrowcount();
		int colcount=excel.getcolcount();
		
		
		Object data[][]=new Object[rowcount][colcount];
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				String celldata=excel.getcelldataString(i, j);
				System.out.print(celldata+"  |   ");
				data[i][j]=celldata;
			}
			System.out.println();
		}
	return data;
	}
	
@DataProvider(name="testdata")
public Object[][] getdata()
{
	String excelPath="C:\\Users\\Rakesh\\git\\hybridframework\\addingdependencies\\excel\\data.xlsx";
	Object data[][] = testdata(excelPath, "Sheet1");
	return data;
	
}
@Test(dataProvider = "testdata")
public void test1(String username, String password)
{
	System.out.println(username+ " | " +password);
}
}
