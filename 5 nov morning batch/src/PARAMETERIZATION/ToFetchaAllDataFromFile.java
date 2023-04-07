package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchaAllDataFromFile {
	
	
public static void main(String[]args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\Prasad\\\\Documents\\\\Automation Testing\\\\Demo Parametirization.xlsx");
		
		Sheet sheet1 = WorkbookFactory.create(file).getSheet("Sheet2");
		
		
        for(int i=0;i<=sheet1.getLastRowNum();i++) {
        	
        	for(int j=0;j<=sheet1.getRow(i).getLastCellNum()-1;j++) {
        		
        		String data = sheet1.getRow(i).getCell(j).getStringCellValue();
        		System.out.print(" "+data);
        		
        	}
        	System.out.println();
        }
}
}