package arcade;

import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Sound {
	public void playSound() throws IOException{
		  
	    // open the sound file as a Java input stream
		    // create an audiostream from the inputstream
		    InputStream inputStream = getClass().getResourceAsStream("Dokistartmusic.wav");
		    AudioStream audioStream = new AudioStream(inputStream);
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
			// TODO Auto-generated catch block
		    
	  }
	 public void staticsound() throws IOException{
		  InputStream inputStream = getClass().getResourceAsStream("superrape.wav");
		    AudioStream audioStream = new AudioStream(inputStream);
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
	  }
	 public void scream() throws IOException{
		    InputStream inputStream = getClass().getResourceAsStream("femalescream.wav");
		    AudioStream audioStream = new AudioStream(inputStream);
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
	}
}
