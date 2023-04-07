package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Numericalvalue {
	
	
public static void main(String[]args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Prasad\\Downloads\\Demo Parametirization.xlsx");
		
		 double number = WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getCell(0).getNumericCellValue();
		
		
		System.out.println(number);
		

}
}