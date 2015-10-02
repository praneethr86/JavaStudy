package adapterPattern;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing MP4 format for file: "+ fileName);
	}

}
