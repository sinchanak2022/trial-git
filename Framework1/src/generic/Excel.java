package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class Excel {
	public static String getData(String sheet,int row,int column) throws EncryptedDocumentException, IOException 
	{
		String val="";
		FileInputStream fid=new FileInputStream("./excel/hybrid.xlsx");
		Workbook wb=WorkbookFactory.create(fid);
		Cell c=(Cell) wb.getSheet(sheet).getRow(row).getCell(column);
		return val=((org.apache.poi.ss.usermodel.Cell) c).getStringCellValue();
	}
}
11