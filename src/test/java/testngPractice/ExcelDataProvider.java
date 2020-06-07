package testngPractice;

import exceldata.WithoutHardcodingData;

public class ExcelDataProvider {
	public void testdata(String excelPath,String sheetName)
	{
		WithoutHardcodingData excel=new WithoutHardcodingData(excelPath, sheetName);
		excel.getrowcount();
		excel.getcolcount();
		
	}

}
