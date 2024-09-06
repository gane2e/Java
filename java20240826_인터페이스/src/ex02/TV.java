package ex02;

interface TV {
	
	abstract void powerOn();
	void powerOff();
	void soundUp();
	void soundDown();
	
	//채널변경추가
	//구현을 해도되고 하지않아도됨.
	default void channelUp() {
		
	};
	default void channelDown() {
		
	};
}
