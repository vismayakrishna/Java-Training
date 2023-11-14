package excel.read;

import java.io.IOException;

public class ExcelReadMain {

	public static void main(String[] args) throws IOException {
		ExcelFileRead obj = new ExcelFileRead();
		obj.readFile();
		System.out.println("Data: " + obj.readData(1, 1));

	}

}
