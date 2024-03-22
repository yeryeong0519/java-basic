package interfaceEx;

public class Audio implements RemoteControl {

	private int Volume;
	private int memoryVolume;

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void setVolume(int Volume) {
		if (Volume > RemoteControl.MAX_VOLUME) {
			this.Volume = RemoteControl.MAX_VOLUME;
		} else if (Volume < RemoteControl.MIN_VOLUME) {
			this.Volume = RemoteControl.MIN_VOLUME;
		} else {
			this.Volume = Volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.Volume);
	}

	// 디폴트메소드

	@Override
	public void setMute(boolean mute) {
		if (mute) {
			this.memoryVolume = this.Volume;
			System.out.println("무음처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음을해제합니다.");
			setVolume(this.memoryVolume);
		}
	}

	// 정적메소드
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}

}
