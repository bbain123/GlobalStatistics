import java.io.*;
import java.io.FileNotFoundException;


//Is used to take the user input username and password.
public class LoginInterface{
	private static LoginInterface Linterface = null;
	private VerificationServer verification;
  
	private LoginInterface(){   
		verification = new VerificationServer();
	}
  
	public static LoginInterface getInstance(){//initializing new user interface
		if(Linterface == null)
			Linterface = new LoginInterface();
    
		return Linterface;
	}
  
  public boolean login(String userName, String passWord) {//compares username and password to array of valid inputs
  	Proxy proxyObject = new Proxy(userName, passWord);  
    if(verification.verify(proxyObject) == true)      
      	return true;
    else
    	return false;
    	
  }
  
  public boolean addUser(String userName, String passWord){//takes the inputted username and password and adds it to the array of valid inputs.
    Proxy proxyObject = new Proxy(userName, passWord);
    if(verification.addUser(proxyObject)) { //successfully added user
    	System.out.println("Added new user");
    	return true;
    }
    return false;							//unsuccessfully added user
    
  }
  
}