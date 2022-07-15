package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	File myFile=new File("D:\\Excels\\Book1.xlsx");
	Workbook work = WorkbookFactory.create(myFile);
    Sheet mySheet = work.getSheet("Sheet1");
    Row myRow = mySheet.getRow(0);
    Cell myCell = myRow.getCell(0);
	CellType cellInfo = myCell.getCellType();
	
	System.out.println(cellInfo);
	
	Sheet mySheet1 = work.getSheet("Sheet1");
	
	for(int i=0;i<=2;i++)
	{
		for(int j=0;j<=2;j++)
		{
			String value = mySheet1.getRow(i).getCell(j).getStringCellValue();
		    System.out.print(value+ " "); 
		}
		   System.out.println();
	}
	
	 System.out.println("=====================");
	}

}
