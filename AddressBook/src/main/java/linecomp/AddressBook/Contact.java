package linecomp.AddressBook;

public class Contact 
{
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private long zip;
    private long phoneNumber;
    private String emailId;
    
    public Contact(String firstName,String lastName,String city,String state,long zip,long phoneNumber,String emailId) {
    	super();
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.city=city;
    	this.state=state;
    	this.zip=zip;
    	this.phoneNumber=phoneNumber;
    	this.emailId=emailId;
    }

	public Contact() {

	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
    
    

}
