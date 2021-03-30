
import java.util.*;
import java.io.*;

//Verifies the user credentials and gives access to the main interface.
public class VerificationServer{
 	private Map<String, String> credentials;
 	String directory = System.getProperty("user.home");
 	String fileName = "users";
 	String absolutePath = directory + File.separator + fileName;
  
 	
 	public VerificationServer(){
 		credentials = new HashMap<String, String>();
 		readAccounts();
 	}
  
  //Adds a new users information to verification database if the username is not already taken. Return true if successful, return false if unsuccessful
 	public boolean addUser(Proxy proxyObject){
 		boolean found = false;
 		
 		if((proxyObject.getUsername()).equals("") || (proxyObject.getPassword()).equals("")) {  //if username or password field is left empty
 			System.out.println("Please enter credentials before creating an account");
 		}

 		else {
 	 		for(Map.Entry<String, String> entry: credentials.entrySet()){ 			//goes through credentials to make sure there are no duplicate usernames
 	 			String uName = entry.getKey();
 	 			if (uName.equals(proxyObject.getUsername())){ 					//if the user name is found
 	 				System.out.println("Username taken! Use a different username"); //message in place for if we want to throw an error?
 	 				found = true;
 	 			}
 	 		}
 	    	
 	 		if(!found) {																	//if the username is not found, add it to credentials 
 	 			writeAccounts(proxyObject);
 	 			credentials.put(proxyObject.getUsername(), proxyObject.getPassword());
 	 			return true;
 	 		}
 		}
 		return false;
 	}
 	
 	//Writes to the text file "users"
 	public void writeAccounts(Proxy proxyObject) {			 
 		try(BufferedWriter bw = new BufferedWriter(new FileWriter(absolutePath, true))) {
 			String fileContent = "\n" + proxyObject.getUsername() + " " + proxyObject.getPassword() ;
 			bw.write(fileContent);
 			bw.close();
 		}
 		catch(IOException e) {
 			System.out.println("Uh oh...error in writing to the file?");
 		}
 	}
 	
 	//Reads in the text file users
 	public void readAccounts() {
 		try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {
 			String currLine = br.readLine(); 
 			if(currLine != null)				//skip the first blank line of the text file 
 				currLine = br.readLine();
 			
 			while(currLine != null) {		
 				StringTokenizer st = new StringTokenizer(currLine);
 				//Proxy newUser = new Proxy(st.nextToken(), st.nextToken());
 				//addUser(newUser);
 				credentials.put(st.nextToken(), st.nextToken());
 				currLine = br.readLine();
 			}
 		}
 		catch(IOException e) {
 			System.out.println("Uh oh...error in reading file");
 		}
 	}
 
  
  
  //Checks for the users information in the verification database. If account is verified return true, else return false
 	public Boolean verify(Proxy proxyObject){ 																
 		if(!credentials.isEmpty()){
 			if(proxyObject.getPassword().equals(credentials.get(proxyObject.getUsername()))){ //if password matches the password kept for the username, verified.
 				return true;
 			} 	
 		}
 		else {
 			System.out.println("No users are in our system. Please make an account");
 			return false;				//not verified
 		}
 		return false;
 		
 	}
  
  
}