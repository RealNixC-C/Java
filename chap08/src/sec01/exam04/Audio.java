package sec01.exam04;

public class Audio implements RemoteConrtol{
	
	// 필드
	private int volume;
	
	// turnOn() 추상 메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteConrtol.MAX_VOLUME) {
			this.volume = RemoteConrtol.MAX_VOLUME;
		} else if (volume < RemoteConrtol.MIN_VOLUME) {
			this.volume = RemoteConrtol.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
	
}
