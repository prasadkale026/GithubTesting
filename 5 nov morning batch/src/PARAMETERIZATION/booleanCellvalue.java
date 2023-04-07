package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class booleanCellvalue {
	
	
public static void main(String[]args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Prasad\\Documents\\Automation Testing\\Demo Parametirization.xlsx");
		
	 boolean result = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
		
		
		System.out.println(result);
		

}
}