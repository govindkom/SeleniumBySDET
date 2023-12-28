package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelreadingwithIteratorMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// excelreadingwithIteratorMethod
		
		String excelFilePath=".\\DataFile\\countries.xlsx";
		
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		
		XSSFWorkbook workbook= new XSSFWorkbook(inputstream);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		// Iterrator method
		
		Iterator itr=sheet.iterator();
		
		while(itr.hasNext()) {
			XSSFRow row = (XSSFRow) itr.next();
			
			Iterator celliterator=row.cellIterator();
			
			while(celliterator.hasNext()) {
				XSSFCell cell=(XSSFCell) celliterator.next();
				
				switch(cell.getCellType()) {
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
					
					
				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
					break;
					
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				}
			}
			System.out.println();
		}

	}

}
