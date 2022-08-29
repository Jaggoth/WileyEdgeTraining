package StringFormatExercise.Accounts;

public class Account {
	private int accID;
	private Address address;
	
	public Account(int accID, Address address) {
		this.accID = accID;
		this.address = address;
	}
	/**
	 * @return the accID
	 */
	public int getAccID() {
		return accID;
	}
	/**
	 * @param accID the accID to set
	 */
	public void setAccID(int accID) {
		this.accID = accID;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
}
