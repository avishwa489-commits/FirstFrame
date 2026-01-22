package abc;

import org.testng.annotations.Test;

public class SampleTest {
@Test
public void createContact() {
	String URL = System.getProperty("url");
	String BROWSER = System.getProperty("browser");
	String USERNAME = System.getProperty("username");
	String PASSWORD = System.getProperty("password");
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);

	System.out.println("executed createContact");
}
@Test
public void createOrg() {
	System.out.println("executed createOrg");
}

}
