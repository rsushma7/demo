package beans;

public class Employee {

	public Employee(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	private int code;
	private String name;
	private Address addr;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public void setName(String name) {
		this.name = name;
	}
}
