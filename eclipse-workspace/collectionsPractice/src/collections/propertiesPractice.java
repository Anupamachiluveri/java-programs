package collections;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;
import java.io.FileOutputStream;
public class propertiesPractice {

	public static void main(String[] args) throws IOException {
		File file =new File("db config.properties");

		if(!file.exists()) 
			file.createNewFile();
		System.out.println(file.exists());

		Properties pro = new Properties();
		pro.setProperty("url","http/374.44.4.4");
		pro.setProperty("username","anupama");
		pro.setProperty("passward","anu123");

		FileOutputStream fl = new FileOutputStream(file);

		pro.store(fl, "new file ks created");

		Enumeration<Object> values = pro.elements();
		while(values.hasMoreElements()) {
			System.out.println(values.nextElement());
		}

		System.out.println(pro.keySet());

		System.out.println(pro.values());

	}  

}


