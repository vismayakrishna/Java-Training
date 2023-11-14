package properties.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\haikr\\git\\Java-Training\\my_maven\\src\\main\\resources\\data.properties");
		Properties pr = new Properties();
		pr.load(fr);
		System.out.println(pr.getProperty("userName"));
		System.out.println(pr.getProperty("password"));
		
		/*
		pr.setProperty("email", "vismayar@gmail.com");
		pr.setProperty("mobile", "1234567890");
		//FileWriter fw = new FileWriter("C:\\Users\\haikr\\git\\Java-Training\\my_maven\\src\\main\\resources\\data.properties");
		FileWriter fw = new FileWriter("info.properties");  //adding to a new file
		pr.store(fw, "newly added");
		*/
		
		Properties pr1 = new Properties();
		pr1.setProperty("email", "vismayar@gmail.com");
		pr1.setProperty("mobile", "1234567890");
		//FileWriter fw = new FileWriter("info.properties");  //adding to a new file
		//pr1.store(fw, "newly added");
		pr1.store(new FileWriter("info.properties"), "newly added");
	}
}
