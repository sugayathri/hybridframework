package exceldata;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUsingPoi {

	public static void getrowcount()
	{
		try
		{
			String path=System.getProperty("user.dir");
		//XSSFWorkbook wb=new XSSFWorkbook("C:\\Users\\Rakesh\\git\\hybridframework\\addingdependencies\\excel\\data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(path +"\\excel\\data.xlsx");
			XSSFSheet sh=wb.getSheet("Sheet1");
			int rowscount=sh.getPhysicalNumberOfRows();
			System.out.println("no. of rows:"+rowscount);
			
	}		
		catch (Exception e) {
			
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		System.out.println(e.getStackTrace());
		}
			
		}
	public static void main(String[] args) {
		
getrowcount();
	}

}
