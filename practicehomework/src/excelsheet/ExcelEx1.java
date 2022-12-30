package excelsheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEx1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("D:\\Selenium velocity\\poi\\Myfiles.xlsx");
		
		
		String value1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		
		
		System.out.println(value1);
		
		
		

	}

}
