package exceldata;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WithoutHardcodingData {
static String path;
static XSSFWorkbook wb;
static XSSFSheet sh;
public WithoutHardcodingData(String excelPath,String sheetName)
{
	try
	{
	
	wb=new XSSFWorkbook(excelPath);
	sh=wb.getSheet(sheetName);
}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public static void getrowcount()
{
	try
	{
		int rowscount=sh.getPhysicalNumberOfRows();
		System.out.println("no. of rows:"+rowscount);
	}
	catch (Exception e) {
		
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		System.out.println(e.getStackTrace());
		}
}
public static void getcolcount()
{
	try
	{
		int colcount=sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("no.of columns:"+colcount);
	}
	catch (Exception e) {
		
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		System.out.println(e.getStackTrace());
		}
}

public static void getcelldataString(int rowNum,int colNum)
	{
		try
		{
			
		
		
	String celldata=sh.getRow(rowNum).getCell(colNum).getStringCellValue();
	System.out.println(celldata);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		System.out.println(e.getCause());
		System.out.println(e.getStackTrace());
		}
	}
public static void getcelldataNumber(int rowNum,int colNum)
{
	try
	{
		
	
	
double celldata=sh.getRow(rowNum).getCell(colNum).getNumericCellValue();
System.out.println(celldata);
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	System.out.println(e.getCause());
	System.out.println(e.getStackTrace());
	}
}
	


}
