package Day08.Ex02_MultiImplement;

public interface RemoteControl {
	
	int MAX_VOLUME = 300;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolum(int volume);
	void setChannel(int channel);
	
	default void setMute(boolean mute) {
		if( mute ) {
			System.out.println("음소거 설정되었습니다.");
			setVolum(MIN_VOLUME);
		}
		else {
			System.out.println("음소거 해제되었습니다.");
			setVolum(10);
		}
	}
	
	static void changBatter( ) {
		System.out.println("배터리 교체");
	}

}
