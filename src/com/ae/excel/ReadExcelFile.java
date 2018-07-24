package com.ae.excel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.ae.vo.ProductDetailsVO;


public class ReadExcelFile 
{
	private String filePath = ".\\data\\data.xlsx";
	Workbook workbook = null;
	
	public ReadExcelFile()
	{
		try 
		{
			workbook = WorkbookFactory.create(new File(filePath));
		
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	private List<ProductDetailsVO> readExcelProductDetailsSheet(String sheetName)
	{
		try 
		{
			Sheet sheet = workbook.getSheet(sheetName);

			Map<Integer, String> headerIndexMap = readHeader(sheet);
			
			List<ProductDetailsVO> productDetailsVOList = new ArrayList<>();
			
			for (Row row: sheet) 
			{
				Map<String, Object> rowMap = new HashMap<>();

				if(row.getRowNum() == 0)
				{
					continue;
				}
				
				for(Cell cell: row) 
				{
					Object value = readCellValue(cell);
					int columnIndex = cell.getColumnIndex();
					
					String columnName = headerIndexMap.get(columnIndex);
					
					rowMap.put(columnName, value);
				}
				
				ProductDetailsVO productDetailsVO = new ProductDetailsVO(rowMap);
				productDetailsVOList.add(productDetailsVO);

			}

			return productDetailsVOList;

		} catch (EncryptedDocumentException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}

	private Map<Integer, String> readHeader(Sheet sheet) 
	{
		Map<Integer, String> headerIndexMap = new HashMap<>();

		Row row = sheet.getRow(0);
		
		for(Cell cell: row) 
		{
			String value = (String) readCellValue(cell);
			headerIndexMap.put(cell.getColumnIndex(), value);
		}
		
		return headerIndexMap;
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
	
	public void closeWorkbook()
	{
		try 
		{
			workbook.close();
		
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		ReadExcelFile readExcelFile = new ReadExcelFile();
		List<ProductDetailsVO> productDetailsVOList = readExcelFile.readExcelProductDetailsSheet("Product_Details");
		System.out.println(productDetailsVOList);
		readExcelFile.closeWorkbook();
	}
}
