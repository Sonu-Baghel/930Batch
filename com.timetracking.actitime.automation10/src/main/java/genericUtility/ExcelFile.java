package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {
	public String importDataFromExcel(String sheet1,int row,int cell) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis=new FileInputStream("./src/test/resources/exceldata.xlsx");
	WorkbookFactory wb= (WorkbookFactory) WorkbookFactory.create(fis);
	return ((Workbook) wb).getSheet(sheet1).getRow(row).getCell(cell).toString();
	
			
	

}
}
