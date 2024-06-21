package day8;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {
	
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Aayush Kanholikar\\Desktop\\Test.xlsx";
		FileInputStream fis = new  FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Data");
		int rowCount = sh.getLastRowNum();
		
		
		for(int i=0; i<=rowCount; i++) {
			int cellCount = sh.getRow(i).getLastCellNum();
			System.out.println("Row "+i+" data is:");
			for(int j=0; j<cellCount; j++) {
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		}
	}
	
	
	

}
