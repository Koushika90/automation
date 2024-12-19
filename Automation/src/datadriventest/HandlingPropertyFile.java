package datadriventest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./docs/commondata.properties");
		
		Properties p = new Properties();

		p.load(fis);
		
		String url= p.getProperty("url");
		
		System.out.println(url);
		
	}
}
