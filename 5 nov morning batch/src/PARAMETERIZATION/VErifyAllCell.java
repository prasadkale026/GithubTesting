package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VErifyAllCell {
	
	
public static void main(String[]args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Prasad\\Documents\\Automation Testing\\Demo Parametirization.xlsx");
		
	    Cell cellinfo = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(2);
	    
	  CellType ct = cellinfo.getCellType();
	    
	    if(ct==CellType.STRING) {
	    	System.out.println(cellinfo.getStringCellValue());
	    	
	    }
	    else if(ct==CellType.NUMERIC){
	    	System.out.println(cellinfo.getNumericCellValue());
	    }
	    else if(ct==CellType.BOOLEAN) {
	    	System.out.println(cellinfo.getBooleanCellValue());
	    	}
	    }

}
