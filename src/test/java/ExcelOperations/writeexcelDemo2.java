package ExcelOperations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeexcelDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
// writeexcelDemo2
		
		// using arrayList collection method
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("EMP Info");
		
		ArrayList<Object[]>empdata= new ArrayList<Object[]>();
		
		empdata.add(new Object[] {"empid","name","job"});
		empdata.add(new Object[] {101,"govind","engineer"});
		empdata.add(new Object[] { 102, "smith", "manager" });
		empdata.add(new Object[] { 103, "david", "analyst" });
		
		
		// using for each ;loop
		int rowCount=0;
		int colCount=0;
		for(Object[] emp:empdata)
		{
			XSSFRow row=sheet.createRow(rowCount++);
			for(Object value: emp) {
				XSSFCell cell = row.createCell(colCount++);
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		
		String filepath = ".\\DataFile\\empdetails.xlsx";
		FileOutputStream outstream = new FileOutputStream(filepath);
		workbook.write(outstream);
		//workbook.write(outstream);
		// workbook.write(outdtream);

		outstream.close();

		System.out.println("employee xlsx file written successfully");
	}

}
