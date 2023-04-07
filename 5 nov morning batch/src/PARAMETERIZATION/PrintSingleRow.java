package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintSingleRow {
	
	
	
public static void main(String[]args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Prasad\\Downloads\\Demo Parametirization.xlsx");
		 
		Sheet sheet1 = WorkbookFactory.create(file).getSheet("Sheet1");
		
		short cellsize = sheet1.getRow(1).getLastCellNum();
		
		System.out.print(cellsize);
		
		
		for(int i=0;i<cellsize;i++) {
			
			String data = sheet1.getRow(8).getCell(i).getStringCellValue();
			
			System.out.print(" "+data);
		}

}
}