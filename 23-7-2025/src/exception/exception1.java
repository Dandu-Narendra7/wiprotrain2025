package exception;

public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fName=null;
		try {
		       String upperName =fName.toUpperCase();
				System.out.println("Uppercase Name:"+ upperName);
				
		}catch (NullPointerException e) { 
				System.out.println("fName is nul1,Cannot convert to uppercase");
	}
		System.out.println("program is runing ok");
	}

}
