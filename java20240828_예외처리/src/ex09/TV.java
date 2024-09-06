package ex09;

public class TV {

	private String model;
	private int size;
	private int channel;
	
	public TV() {}
	public TV(String model, int size, int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	}
	
	public void channelUp() {
		channel++;
		if(channel > 10) {
			this.channel= 0; 
		}
	}
	public void channelDown() {
		channel--;
		if(channel < 1) {
			this.channel= 10; 
		}
	}
	
	//getter
	public String getModel() {
		return model;
	}
	public int getSize() {
		return size;
	}
	public int getChannel() {
		return channel;
	}

	
	//setter
	public void setModel(String model) {
		this.model = model;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}

	
	
	
}
