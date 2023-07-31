package entities;

public class Rent {
	
	private String name;
	private String email;
	private int rentedRoom;
	private boolean busy;
	
	public Rent(String name, String email, int rentedRoom) {
		this.name = name;
		this.email = email;
		this.rentedRoom = rentedRoom;
		busy = true;
	}

	public boolean isBusy() {
		return busy;
	}


	public void setBusy(boolean busy) {
		this.busy = busy;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRentedRoom() {
		return rentedRoom;
	}

	public void setRentedRoom(int rentedRoom) {
		this.rentedRoom = rentedRoom;
	}
	
	public String toString() {
		String msg = rentedRoom + ": " + name + ", " + email;
		return msg;
	}

}
