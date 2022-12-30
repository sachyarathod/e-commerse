 package excelshetread;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfiles = new File("D:\\Selenium velocity\\poi\\myfiles.xlsx");
		
		
		String Value1 = WorkbookFactory.create(myfiles).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		System.out.println(Value1);
		
		
	}

}
