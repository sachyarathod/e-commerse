package excelsheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		
	      File myfile = new File("D:\\Selenium velocity\\poi\\Myfiles.xlsx");
	  
	      Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	      
	      String value = mysheet.getRow(9).getCell(0).getStringCellValue();
	        double value1 = mysheet.getRow(9).getCell(2).getNumericCellValue();
	       
	      System.out.println("My name is "+value);
	      System.out.println("My mobile number is "+value1);
	       
	      // to get last row No we use getlastrownum method
	      int lastrowNo = mysheet.getLastRowNum();
	        
	      // to get last cell no we use 
	      int lastcelNo = mysheet.getRow(0).getLastCellNum()-1;
	     
	      System.out.println("lastrowNo and lastcellNo "+lastrowNo+" "+lastcelNo);
	       
	       System.out.println("====================================");
	      // i want to read whole data of sheet
	      
	      // outer for loop for row
	      for(int i=0;i<=lastrowNo;i++)
	      {
	    	  // inner for loop for column
	    	  for(int j=0;j<=lastcelNo;j++)
	    	  {
	    		  CellType celltype = mysheet.getRow(i).getCell(j).getCellType();
	    		  
	    		  if(celltype==CellType.STRING)
		    	  {
		    		 String Stringvalue = mysheet.getRow(i).getCell(j).getStringCellValue();
		    		 System.out.println(Stringvalue);
		    		 System.out.println("====================================");
		    	  }
	    		  else if (celltype==CellType.NUMERIC) 
	    		  {
	    			  double numeric = mysheet.getRow(i).getCell(j).getNumericCellValue();
	    			  System.out.println(numeric);
	    			  
				}
	    		  else if (celltype==CellType.BOOLEAN) 
	    		  {
	    			  boolean boolenvalue = mysheet.getRow(i).getCell(j).getBooleanCellValue();
	    			  System.out.println(boolenvalue);
				}
	    		  
					
				
	    	  }
	    	  
	      }
	}

}
