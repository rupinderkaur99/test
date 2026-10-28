package Testingpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class practise2 {

@Test

@DataProvider(name= "testing")
public Object[][]login()
{
	return  new Object[][]
			{
					{"Admin", "password123"},
					{"Admin1", "password1234"},
{"Admin2", "password1234"},
			};
}
@Test(dataProvider= "testing")
public void result(String username, String password)
{
	System.out.println("email" + username);
	System.out.println("password" +password);
}
}
