package day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\Aayush Kanholikar\\Desktop\\Test.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Data");
		XSSFRow  row = sh.getRow(4);
		String un = row.getCell(0).getStringCellValue();
		String gender = row.getCell(1).getStringCellValue();
		
		System.out.println(un+"==>"+gender);
		
		
		
		
	}

}
