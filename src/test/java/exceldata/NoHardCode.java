package exceldata;

public class NoHardCode {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		WithoutHardcodingData excel=new WithoutHardcodingData(path+"\\excel\\data.xlsx", "Sheet1");
		excel.getrowcount();
excel.getcelldataNumber(1, 1);
excel.getcelldataString(0, 0);
excel.getcolcount();
	}

}
