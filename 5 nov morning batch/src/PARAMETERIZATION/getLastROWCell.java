package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getLastROWCell {
	
	
public static void main(String[]args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Prasad\\Downloads\\Demo Parametirization.xlsx");
		
	//	  int lastRownumber = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		
		
	//	System.out.println(lastRownumber+1);
		
		
	short lastCellnumber = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getLastCellNum();
		
	System.out.println(lastCellnumber);
	
		
		
		
		
		
}
}