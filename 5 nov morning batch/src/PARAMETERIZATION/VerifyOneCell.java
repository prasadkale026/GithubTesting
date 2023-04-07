package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyOneCell {
	
public static void main(String[]args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Prasad\\Documents\\Automation Testing\\Demo Parametirization.xlsx");
		
		CellType Ct = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getCellType();

		System.out.println(Ct);




}
}