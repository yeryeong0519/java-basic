package inheritance;

import interfaceEx.RemoteControl;

public class smartTV implements RemoteControl, Searchable{		//인터페이스들을 구현해달라
	
	@Override
	public void search(String url) {
	System.out.println(url + "를(을) 검색합니다.");
}
	@Override
	public void turnOn() {
		System.out.println("SmartTV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 SmartTV 볼륨 : " + this.volume);
	}
	
}
