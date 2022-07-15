package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File myFile=new File("D:\\Selenium\\Book12.xlsx");
	Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
	
	int totalNoOfRows = mySheet.getLastRowNum();	
	int rowCount = totalNoOfRows;	
	System.out.println(rowCount);	
	
	short totalNumberOfColumns =mySheet.getRow(totalNoOfRows).getLastCellNum();
	int columnCount = totalNumberOfColumns;
	System.out.println("Total number of columns are "+columnCount);
    
	for(int i=0;i<=rowCount;i++)
	{
		for(int j=0;j<=columnCount;j++)
		{
			Cell myCell = mySheet.getRow(i).getCell(j);
			CellType dataType = myCell.getCellType();
		
		
		if(dataType==CellType.STRING)
		{
			String value = myCell.getStringCellValue(); 
			 System.out.print(value+" ");	
		}
		
		else if(dataType==CellType.BOOLEAN)
		 {
			 boolean value = myCell.getBooleanCellValue();
			 System.out.print(value+" ");
		 }

		 else if(dataType==CellType.NUMERIC)
		 {
			 double value = myCell.getNumericCellValue();
			 System.out.print(value+" ");
		 }
		 else if(dataType==CellType.BLANK) 
		 {
			 System.out.print(" ");
		 }
		 
	}
		
	}

}}
