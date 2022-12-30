package excelshetread;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("D:\\Selenium velocity\\poi\\Myfiles.xlsx");

		String value = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
	
	    System.out.println(value);
	
	}

}
