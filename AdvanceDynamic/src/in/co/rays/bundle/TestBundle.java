package in.co.rays.bundle;

import java.util.ResourceBundle;

public class TestBundle {

	
	public static void main(String[] args) {
		
	ResourceBundle	rb =ResourceBundle.getBundle("com.rays.bundle.system");
		
		String driver =rb.getString("greeting");
		System.out.println(driver);
	}
	
	
}
