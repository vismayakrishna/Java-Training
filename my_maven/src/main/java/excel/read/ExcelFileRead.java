package excel.read;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileRead {
	
	XSSFSheet sh;
	
	public ExcelFileRead() throws IOException {
		FileInputStream f = new FileInputStream(
				"C:\\Users\\haikr\\git\\Java-Training\\my_maven\\src\\main\\resources\\excel-data.xlsx");
		XSSFWorkbook x = new XSSFWorkbook(f);
		sh=x.getSheet("Sheet1");
	}

	public static void main(String[] args) {
		
	}

}
