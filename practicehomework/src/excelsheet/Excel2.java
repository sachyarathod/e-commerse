package excelsheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// create object of file and provide path as a arguments
		File myfile = new File("D:\\Selenium velocity\\poi\\Myfiles.xlsx");
		
		// here store excel sheet in mysheet
		     Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");

		     // find out total no of rows in sheet using getlastrow method
		      int totalNoofRow = mysheet.getLastRowNum();
		      
		      System.out.println("total no. of rows "+totalNoofRow);
		      
		      // find out total no of cells in excel sheet using getlastcell method
		     int totalNoofCells = mysheet.getRow(0).getLastCellNum()-1;
		     
		     System.out.println("Total No. of cells "+totalNoofCells);
		     
		     // use for loop for print rows and cells
		     
		     // outer for loop for -----> rows
		     
		     for(int i=0;i<=totalNoofRow;i++)
		     {
		    	 // inner for loop for ----> cells
		    	 
		    	 for(int j=0;j<=totalNoofCells;j++)
		    	 {
		    		 // here we get celltype of data
		    		   CellType celltype1 = mysheet.getRow(i).getCell(j).getCellType();
		    		   
		    	 // we use else if for multiple conditions
		    	 if(celltype1==CellType.STRING)
		    	 {
		    		  String Stringvalue = mysheet.getRow(i).getCell(j).getStringCellValue(); 
		    		  
		    		  System.out.print(Stringvalue+" ");
		    	 }
		    	 else if(celltype1==CellType.BOOLEAN)
		    	 {
		    		 boolean booleanvalue = mysheet.getRow(i).getCell(j).getBooleanCellValue();
		    		 
		    		 System.out.print(booleanvalue+" ");
		    	 }
		    	 else if(celltype1==CellType.NUMERIC)
		    	 {
		    		 double numericvalue = mysheet.getRow(i).getCell(j).getNumericCellValue();
		    		 System.out.print(numericvalue+" ");
		    	 }
		    	 System.out.println();
		    	 }
		     }
		     
		     
		     
		     
		     
		     
	}

}
