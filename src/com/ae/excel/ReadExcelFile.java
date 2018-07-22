package com.ae.excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcelFile 
{
	private String filePath = "./data/data.xlsx";

	private void readExcel(String sheetName)
	{
		try {

			Workbook workbook = WorkbookFactory.create(new File(filePath));

			Sheet sheet = workbook.getSheet(sheetName);

			for (Row row: sheet) 
			{
				for(Cell cell: row) 
				{
					Object value = readCellValue(cell);
				}
			}

			workbook.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		}
	}

	private Object readCellValue(Cell cell)
	{
		Object value;
		
		switch (cell.getCellTypeEnum()) 
		{
		case STRING:
			value = cell.getRichStringCellValue().getString();
			break;
		case BOOLEAN:
            value = cell.getBooleanCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) 
			{
				value = cell.getDateCellValue();
			} else 
			{
				value = cell.getNumericCellValue();
			}
			break;
		case FORMULA:
			value = cell.getCellFormula();
			break;
		case BLANK:
			value = "";
			break;
		default:
			value = "";
		}
		
		return value;
	}
}
