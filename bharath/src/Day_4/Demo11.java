         //encapsulation prblm.

package Day_4;

public class Demo11 {
	private String firstname;
	private String lastname;
	private String Email;
	private long PhoneNumber;
	
	public void setFirstName(String fn) {
		firstname=fn;
	}
	public void setLastName(String ln) {
		lastname=ln;
	}
	public void setEmail(String em) {
		Email=em;
	}
	public void setPhoneNumber(long ph) {
		PhoneNumber=ph;
	}
	public String getFirstName() {
		return firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public String getEmail() {
		return Email;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}

	public static void main(String[] args) {
		Demo11 d1=new Demo11();
		d1.setFirstName("bharath");
		d1.setLastName("reddy");
		d1.setEmail("bharathreddy@gmail.com");
		d1.setPhoneNumber(1234567899);
		System.out.println(d1.getFirstName());
		System.out.println(d1.getLastName());
		System.out.println(d1.getEmail());
		System.out.println(d1.getPhoneNumber());
	}

}
