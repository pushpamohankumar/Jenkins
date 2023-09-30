package Home_DashBoard;

import org.testng.annotations.Test;

public class LoginPage {
	
@Test(groups="smoke")
public void login() {
	System.out.println("Login page");
}

@Test(groups="regression")
public void login1() {
	System.out.println("Login1 page");
}
}
