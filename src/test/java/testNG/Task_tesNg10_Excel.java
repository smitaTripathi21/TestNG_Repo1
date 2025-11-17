package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task_tesNg10_Excel {
	
	@Test(dataProvider="RetrieveData")
	  public void login(String userName , String Password) {
		  System.out.println("UserName :" + userName + " Password :" + Password);
	  }

	  
	@DataProvider(name="RetrieveData")
	  public Object[][] getData() throws IOException {
		  FileInputStream fileInput = new FileInputStream(new File("C:\\Users\\smitripa\\Desktop\\TestData1.xlsx"));

			XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
			XSSFSheet sheet = workbook.getSheet("www");
			

			int totalRows = sheet.getLastRowNum();
			int totalCols = sheet.getRow(1).getLastCellNum();
			Object[][] obj = new Object[totalRows][totalCols];

			for (int i = 1; i <= totalRows; i++) {
				
				XSSFRow row = sheet.getRow(i);
				int lastCellNum = sheet.getRow(i).getLastCellNum();
				int firstCellNum = sheet.getRow(i).getFirstCellNum();
				
				for (int j = firstCellNum; j < lastCellNum; j++) {
					if (row.getCell(j).getCellType() == CellType.STRING)
						obj[i-1][j] = row.getCell(j).toString();
				else if(row.getCell(j).getCellType()==CellType.NUMERIC)
					obj[i-1][j] = row.getCell(j).getNumericCellValue();
				}
				System.out.println();
			}
			
			workbook.close();
			return obj ;
	  }
}
