package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//ReadingExcel
		
		// location of excel file
		String excelFilePath=".\\DataFile\\countries.xlsx";
		
		FileInputStream inputstream= new FileInputStream(excelFilePath);
		
		XSSFWorkbook workbook= new XSSFWorkbook(inputstream);
		
		XSSFSheet sheet=workbook.getSheetAt(0);// workbook.getSheet("Sheet1"); ==> two method to get sheets
		
		// using for llop iterate all rows and columns
		
	int rows=sheet.getLastRowNum();
	int cols=sheet.getRow(1).getLastCellNum();
	
	for(int r=0;r<=rows;r++) {
		XSSFRow row = sheet.getRow(r);
		for(int c=0;c<cols;c++) {
			XSSFCell cell = row.getCell(c);
			switch(cell.getCellType())
			{
			case STRING: 
				System.out.println(cell.getStringCellValue());
				break;
			case NUMERIC:
			System.out.println(cell.getNumericCellValue());
			break;
			
			case BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
				break;
			
		
			}
			
		}
		System.out.println();
	}

	}

}
