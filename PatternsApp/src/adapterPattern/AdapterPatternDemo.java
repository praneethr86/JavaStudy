package adapterPattern;

public class AdapterPatternDemo {
	public static void main(String[] args){
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3","beyondhorizon.mp3");
		audioPlayer.play("vlc","alone.vlc");
		audioPlayer.play("mp4","farfaraway.mp4");
		audioPlayer.play("flv", "nostradamus.flv");
	}
}
