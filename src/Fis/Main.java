package Fis;

public class Main {
	static String user = "kns_test";
	static String pass = "test";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fis fis = new Fis();
		fis.connect();
		fis.logIn(user, pass);
		
	}

}
