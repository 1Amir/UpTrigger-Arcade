package arcade;
import java.io.IOException;

import javax.swing.JOptionPane;
public class Run{
	static String game = "";	
	public static void main(String args[]) throws IOException {
			
			game = JOptionPane.showInputDialog("What would you like to play?(Dungeon,Doki,UpTrigger)");
			if(game.equals("Dungeon")) {
				Dungeon play = new Dungeon();
				play.run();
			}
			if(game.equals("dungeon")) {
				Dungeon play = new Dungeon();
				play.run();
			}
			if(game.equals("Doki")) {
				DokiOvertext play = new DokiOvertext();
				play.frames();
			}
			if(game.equals("doki")) {
				DokiOvertext play = new DokiOvertext();
				play.frames();
			}
			if(game.equals("UpTrigger")) {
				UpTrigger play = new UpTrigger();
				play.frames();
			}
		}
	
	
}
