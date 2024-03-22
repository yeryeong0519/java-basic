package interfaceEx;

public class RemoteControlEx01 {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		rc = new Audio();	//인스턴스 객체 생성
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(true);
		rc.setMute(false);
		RemoteControl.changeBattery();
		rc.turnOff();
	}

}
