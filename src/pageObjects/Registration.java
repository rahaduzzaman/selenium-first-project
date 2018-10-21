package pageObjects;

public class Registration {
	
	// Contact Information
	public static final String button_link = "//a[contains(text(),'REGISTER')]";
	public static final String textbox_firstName = "//input[contains(@name, 'firstName')]";
	public static final String textbox_lastName = "//input[contains(@name, 'lastName')]";
	public static final String textbox_phone = "//input[contains(@name, 'phone')]";
	public static final String textbox_email = "//input[contains(@name, 'userName')]";
	
	// Mailing Information
	public static final String textbox_address1 = "//input[contains(@name, 'address1')]";
	public static final String textbox_address2 = "//input[contains(@name, 'address2')]";
	public static final String textbox_city = "//input[contains(@name, 'city')]";
	public static final String textbox_state = "//input[contains(@name, 'state')]";
	public static final String textbox_postalCode = "//input[contains(@name, 'postalCode')]";
	public static final String selectbox_country = "//select[contains(@name, 'country')]";
	
	// User Information
	public static final String textbox_userName = "//input[contains(@name, 'email')]";
	public static final String textbox_password = "//input[contains(@name, 'password')]";
	public static final String textbox_confirmPassword = "//input[contains(@name, 'confirmPassword')]";
	public static final String button_submit = "//input[contains(@name, 'register')]";
	
	//Confirmation
	public static final String text_Note ="//b[contains(text(),'Note:')]";
	
}
