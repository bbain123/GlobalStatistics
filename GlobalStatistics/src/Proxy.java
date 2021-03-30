
public class Proxy{
	private String username, password;
  
	public Proxy(String usrname, String pssword){
		username = usrname;
		password = pssword;
	}
  
	public String getUsername(){
		return username;
	}
  
	public String getPassword(){
		return password;
	}
}
