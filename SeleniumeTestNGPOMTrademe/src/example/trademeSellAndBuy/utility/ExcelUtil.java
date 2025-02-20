package example.trademeSellAndBuy.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil extends BaseTest {
	//Main Directory of the project
	public static final String currentDir = System.getProperty("user.dir");
	//Location of Test data excel file
    public static String testDataExcelPath = null;
   
    //Excel WorkBook
    private static Workbook excelWBook;
 
    //Excel Sheet
    private static XSSFSheet excelWSheet;
    //Excel cell
    private static XSSFCell cell;
    //Excel cell
    private static XSSFRow row;
	// row Number
	public static int rowNumber;
	// Column Number
	public static int columnNumber;

	// Setter and Getters of row and columns
	public static void setColumnNumber(int pColumnNumber) {
		columnNumber = pColumnNumber;
	}

	public static int getColumnNumber() {

		return columnNumber;
	}

	public static void setRowNumber(int pRowNumber) {
		rowNumber = pRowNumber;
	}

	public static int getRowNumber() {
		return rowNumber;
	}
	//This method reads the test data from the Excel cell.
    //We are passing row number and column number as parameters
   public static void setExcelFileSheet(String sheetName) throws IOException {
	   testDataExcelPath = currentDir+"\\src\\example\\trademeSellAndBuy\\testData\\";
	   // Open the Excel file
       FileInputStream excelFile = new FileInputStream(new File(testDataExcelPath + testDataExcelFileName));
       excelWBook = new XSSFWorkbook(excelFile);
       excelWSheet = (XSSFSheet) excelWBook.getSheet(sheetName);
   }
 //This method reads the test data from the Excel cell.
   //We are passing row number and column number as parameters.
   public static String getCellData(int ROWNum, int ColNum) {
   cell= excelWSheet.getRow(ROWNum).getCell(ColNum);
   DataFormatter formatter = new DataFormatter();
   String cellData = formatter.formatCellValue(cell);
   return cellData;
   }
   
 //This method takes row number as a parameter and returns the data of given row number.
   public static XSSFRow getRowData(int RowNum) {
	   row = excelWSheet.getRow(RowNum);
	   return row;
   }
 //This method gets excel file, row and column number and set a value 
   public static void setCellData(String value, int RowNum, int ColNum) throws IOException {
	    row = excelWSheet.getRow(RowNum);
	    cell =row.getCell(ColNum);
	    if (cell == null) {
	    	cell = row.createCell(ColNum);
	    	cell.setCellValue(value);
	    }else {
	    	cell.setCellValue(value);
	    }
	 // Constant variables Test Data path and Test Data file name
	    FileOutputStream fileOut = new FileOutputStream(testDataExcelPath + testDataExcelFileName);
        excelWBook.write(fileOut);
        fileOut.flush();
        fileOut.close();
        
   }
   
   
   
   
}
