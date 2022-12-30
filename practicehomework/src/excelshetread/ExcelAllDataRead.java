  package excelshetread;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelAllDataRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("D:\\Selenium velocity\\poi\\Myfiles.xlsx");
		
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		int TotalNoofRow = mysheet.getLastRowNum();
		      
		System.out.println("total no.of rows "+TotalNoofRow);
		int totalnoofcell = mysheet.getRow(0).getLastCellNum();
		          
		System.out.println("total no. of cell " +totalnoofcell);
		int TotalNumberofcell = totalnoofcell-1;
		System.out.println(TotalNumberofcell);
		          
		// outer for loop for row
		          
		for(int i=0;i<=TotalNoofRow;i++)
		 {
           // inner loop for cell
		        	  
		        	  
		for(int j=0;j<=TotalNumberofcell;j++)
		 {
		    String values = mysheet.getRow(i).getCell(j).getStringCellValue();
		        	 
		     System.out.print(values+" ");
	   }
		    System.out.println();
		        
	}
	       
		         
	}

}
