package prac;

public class Customer {
	private long cid;
	protected String name;
	protected String ssn;
	protected String phone;
	protected String customerId;
	protected String passwd;
//	protected List<Account> accountList;
	
//	public Customer(long cid, String name, String ssn, String phone, String customerId, String passwd) {
//		this.cid = cid;
//		this.name = name;
//		this.ssn = ssn;
//		this.phone = phone;
//		this.customerId = customerId;
//		this.passwd = passwd;
//	}
	
	public void setCid(long cid) {
		this.cid = cid;
	}
	public long getCid() {
		return this.cid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return this.phone;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerId() {
		return this.customerId;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String Passwd() {
		return this.passwd;
	}
}