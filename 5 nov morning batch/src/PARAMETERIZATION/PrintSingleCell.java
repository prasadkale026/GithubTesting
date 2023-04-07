package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintSingleCell {
	
	
public static void main(String[]args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Prasad\\Downloads\\Demo Parametirization.xlsx");
		 
		Sheet happy = WorkbookFactory.create(file).getSheet("Sheet1");
		
        int cellsize =  happy.getLastRowNum();
		
		System.out.print(cellsize+1);
		
		
		for(int i=0;i<=cellsize;i++) {
			
			String data = happy.getRow(i).getCell(3).getStringCellValue();
			
			System.out.print(" "+data);
		}

}
}