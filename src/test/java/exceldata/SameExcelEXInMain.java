package exceldata;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SameExcelEXInMain {

	static String path;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	
		
	
	public static void getcelldataString()
	{
		try
		{
			
		
		path=System.getProperty("user.dir");
		wb=new XSSFWorkbook(path+"\\excel\\data.xlsx");
		sh=wb.getSheet("Sheet1");
	String celldata=sh.getRow(0).getCell(0).getStringCellValue();
	System.out.println(celldata);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		System.out.println(e.getCause());
		System.out.println(e.getStackTrace());
		}
	}

	public static void getcelldataNumber()
	{
		try
		{
			
		
		path=System.getProperty("user.dir");
		wb=new XSSFWorkbook(path+"\\excel\\data.xlsx");
		sh=wb.getSheet("Sheet1");
	double celldata=sh.getRow(1).getCell(1).getNumericCellValue();
	System.out.println(celldata);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		System.out.println(e.getCause());
		System.out.println(e.getStackTrace());
		}
	}
	public static void main(String[] args) {
		
	getcelldataNumber();
	getcelldataString();
	}

}
