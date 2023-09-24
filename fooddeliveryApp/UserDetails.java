package fooddeliveryApp;

public class UserDetails extends Zomato{
	
	private int uid;
	private String username;
	private long mobileno;
	private int password;

	public UserDetails(int uid,String username,long mobileno, int password) {
		super();
	    this.uid=uid;
	    this.username=username;
	    this.mobileno=mobileno;
	    this.password=password;
		
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	
	 
}
