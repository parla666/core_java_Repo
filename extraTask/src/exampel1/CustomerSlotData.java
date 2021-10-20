package exampel1;

public class CustomerSlotData {

	private String name;
	private int slotNo;
	private String timing;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSlotNo() {
		return slotNo;
	}

	public void setSlotNo(int slotNo) {
		this.slotNo = slotNo;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public CustomerSlotData(String name, int slotNo, String timing) {
		super();
		this.name = name;
		this.slotNo = slotNo;
		this.timing = timing;
	}

}
