package Framework.ExcelDataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	// Goal of test is identify the 'Purchase' TC and pull the test data for this TC
	// Scan the first header row and Identify the row for TC's and scan the test cases column
	//Scan the entire TC's column and identify the required TC then scan the entire row

	//Create a method to access the excel data
	public ArrayList<String> getData(String TCname) throws IOException
	{
		//create an object for array list of String type
		ArrayList <String> a = new ArrayList<String>();
		
		//Create an object for fileInputStream 
		FileInputStream fis =new FileInputStream("C:\\Users\\abvb163\\Downloads\\SeleniumWork\\DatadrivenExcel.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		// get the count of sheets from the workbook
		
		int sheets=workbook.getNumberOfSheets();
		for(int i=0; i<sheets;i++)
		{
			
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
				XSSFSheet sheet= workbook.getSheetAt(i);    //Testdata sheet will be assigned to sheet
				Iterator <Row> rows = sheet.iterator();    // Iterate through all the rows of the desired sheet
				Row firstrow= rows.next();				// Move to / access the first row of the desired sheet
				Iterator <Cell> cel= firstrow.cellIterator(); // Get access to all cells of the first row. Sheet is a collection of rows and row is a collection of cells
				int k=0;
				int column = 0;
				
				while (cel.hasNext())
				{
				Cell celvalue=cel.next();
				if (celvalue.getStringCellValue().equalsIgnoreCase("Testcases"))
				{
					//desired column
					column=k;
					
				}
				k++;
			}
			System.out.println(column);
			
	// Once column is identified then scan entire testcase column to identify the purchase testcase row
		while(rows.hasNext())      // Iterate through rows
		{
			Row r=rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase("TCname"))    // pass the required TCName parameter here
					{
						//After u grab purchase testcase row, pull all the data of that row and feed into test
					Iterator<Cell> cv= r.cellIterator();
					while(cv.hasNext())
					{
						// System.out.println(cv.next().getStringCellValue());
						// instead of printing add it to Arraylist
						a.add(cv.next().getStringCellValue());
						
					}
					}
					
		}
		
		
		}
			
		
	}
return a;

	}
	
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		

		
		
	 }
					}
