package interfaceEx;

public interface RemoteControl {
	// 상수필드
	int MAX_VOLUME = 20;
	int MIN_VOLUME = 0;

	// 추상메소드
	void turnOn();

	void turnOff();

	void setVolume(int volume);
	
//	void changeBattery();

	default void setMute(boolean mute) {
		if (mute) { // 참이면
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무은 해제합니다.");
		}
	}
}
