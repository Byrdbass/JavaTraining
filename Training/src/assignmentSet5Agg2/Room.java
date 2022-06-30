package assignmentSet5Agg2;

public class Room {

	int roomNo;
	int capacity =4;
	static {
		int roomCounter = 500;
	}
	
	public Room() {
		super();
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

//	public static int getRoomCounter() {
//		return roomCounter;
//	}
//
//	public static void setRoomCounter(int roomCounter) {
//		Room.roomCounter = roomCounter;
//	}
	
	
	
	
}
