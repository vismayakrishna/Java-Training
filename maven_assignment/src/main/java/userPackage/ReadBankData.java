package userPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import rbiPackage.federal.FederalMethods;
import rbiPackage.sbi.SBIMethods;

public class ReadBankData {
	
	XSSFSheet sheet;
	
	public ReadBankData() throws IOException {
		FileInputStream file = new FileInputStream(
				"D:\\Vismaya-Obsqura-Training\\Java\\Eclipse-Projects\\maven_assignment\\src\\main\\resources\\bank-data.xlsx");
		XSSFWorkbook x = new XSSFWorkbook(file);
		sheet = x.getSheet("Sheet1");
		x.close();
	}
	
	public void readSBIData() {
		SBIMethods obj1=new SBIMethods();
		Cell c1 = sheet.getRow(1).getCell(1);
		Cell c2 = sheet.getRow(1).getCell(2);
		Cell c3 = sheet.getRow(1).getCell(3);
		double pa1=c1.getNumericCellValue();
		double y1=c2.getNumericCellValue();
		double roi1=c3.getNumericCellValue();
		System.out.println("Simple Interest: " + obj1.calculateInterest(pa1, y1, roi1));
	}
	
	public void readFederalData() {
		FederalMethods obj2 = new FederalMethods();
		Cell c1 = sheet.getRow(2).getCell(1);
		Cell c2 = sheet.getRow(2).getCell(2);
		Cell c3 = sheet.getRow(2).getCell(3);
		double pa2=c1.getNumericCellValue();
		double y2=c2.getNumericCellValue();
		double roi2=c3.getNumericCellValue();
		System.out.println("Compound Interest: " + obj2.calculateInterest(pa2, y2, roi2));
	}
}
