package sesschool.bank.vo;

public class Customer {
	String custid;
	String password;
	String email;
	String division;
	String name;
	String idno;
	String address;
	
	public Customer(){}  
	
	public Customer(String custid, String password, String email, String division, String name, String idno,
			String address) {
		super();
		this.custid = custid;
		this.password = password;
		this.email = email;
		this.division = division;
		this.name = name;
		this.idno = idno;
		this.address = address;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", password=" + password + ", email=" + email + ", division=" + division
				+ ", name=" + name + ", idno=" + idno + ", address=" + address + "]";
	}
	
	
}
