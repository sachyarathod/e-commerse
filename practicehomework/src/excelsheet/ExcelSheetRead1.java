package excelsheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetRead1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		File myfile = new File("D:\\Selenium velocity\\poi\\Myfiles.xlsx");
		
		 Sheet myfiles = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		
		System.out.println(myfiles);
		
		for(int i=0;i<=3;i++)
		{
		
			
		String value = myfiles.getRow(0).getCell(i).getStringCellValue();
		
		System.out.print(value+" ");
		}
		System.out.println();
		

	
	
	for(int i=0;i<=1;i++)
	{
	      	String values1 = myfiles.getRow(i).getCell(0).getStringCellValue();
	
	      	System.out.print(values1+" ");
	
	      	
	}
	
	System.out.println();
	
}

}
