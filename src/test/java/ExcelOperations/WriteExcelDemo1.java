package ExcelOperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
// flow of :== workbook==> sheet==> row==>cols
		// WriteExcelDemo1

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("EMP Info");

		Object empdata[][] = { { "EmpId", "Name", "Job" }, 
							{ 101, "govind", "engineer" }, 
							{ 102, "smith", "manager" },
							{ 103, "david", "analyst" } };

		// using for loop
		// find no of rows and no of cols
//		int rows=empdata.length;
//		int cols=empdata[0].length;
//		
//		System.out.println(rows);
//		System.out.println(cols);
//		
//		
//		for(int r=0;r<rows;r++) {
//			XSSFRow row=sheet.createRow(r);
//	
//		for(int c=0;c<cols;c++) {
//			XSSFCell cell=row.createCell(c);
//			
//			Object value=empdata[r][c];
//			
//			if(value instanceof String)
//				cell.setCellValue((String) value);
//			
//			if(value instanceof Integer)
//				cell.setCellValue((Integer) value);
//			
//			if(value instanceof Boolean)
//				cell.setCellValue((Boolean) value);
//		}
//		
//		}

		// using for each loop
		int rowCount = 0;
		int colCount = 0;

		for (Object emp[] : empdata) {

			XSSFRow row = sheet.createRow(rowCount++);

			for (Object value : emp) {

				XSSFCell cell = row.createCell(colCount++);

				if (value instanceof String)
					cell.setCellValue((String) value);

				if (value instanceof Integer)
					cell.setCellValue((Integer) value);

				if (value instanceof Boolean)
					cell.setCellValue((Boolean) value);

			}
		}

		String filepath = ".\\DataFile\\empdetails.xlsx";
		FileOutputStream outstream = new FileOutputStream(filepath);
		workbook.write(outstream);
		// workbook.write(outdtream);

		outstream.close();

		System.out.println("employee xlsx file written successfully");

	}

}
