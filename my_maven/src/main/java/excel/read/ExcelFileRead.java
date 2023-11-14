package excel.read;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileRead {

	XSSFSheet sh;

	public ExcelFileRead() throws IOException {
		FileInputStream f = new FileInputStream(
				"C:\\Users\\haikr\\git\\Java-Training\\my_maven\\src\\main\\resources\\excel-data.xlsx");
		XSSFWorkbook x = new XSSFWorkbook(f);
		sh = x.getSheet("Sheet1");
	}

	public void readFile() {
		for (Row r : sh) {
			for (Cell c : r) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
	
	public String readData(int i, int j) {
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		int cellType = c.getCellType();
		switch (cellType) {
		case Cell.CELL_TYPE_STRING:
			String data = c.getStringCellValue();
			return data;
		case Cell.CELL_TYPE_NUMERIC:
			double d = c.getNumericCellValue();
			return String.valueOf(d);
		default:
			return null;
		}
	}
}
