package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {
	public static void main(String[] args) throws IOException {
		String fileName = "C:\\Users\\smitripa\\Desktop\\TestData.xlsx";
		FileInputStream fileInput = new FileInputStream(new File(fileName));
		
		Workbook workbook = null;
		workbook = WorkbookFactory.create(fileInput);
		Sheet sheet = workbook.getSheet("Data");
		int totalRows = sheet.getLastRowNum();
		for(int i=1;i<=totalRows ;i++) {
			sheet.getRow(i).createCell(3 , CellType.STRING).setCellValue("Passed");
		}
		
		//To add the data in existing data cell
		sheet.getRow(2).getCell(1).setCellValue("Root@456");
		
		FileOutputStream fileOutput = new FileOutputStream(new File(fileName));
		workbook.write(fileOutput);
		workbook.close();
		
	}
}
