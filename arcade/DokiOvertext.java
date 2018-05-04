package arcade;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class DokiOvertext extends Varibles implements KeyListener{
	public void frames()throws IOException{
		DokiOvertext open = new DokiOvertext();
		JFrame frame = new JFrame();
		frame.setSize(1543,869);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(open);
		frame.setVisible(true);
		frame.setResizable(true);
		 Sound sound = new Sound();
		 sound.playSound();
	}
	public DokiOvertext() {
		addKeyListener(this);
	 	setFocusable(true);
    	setFocusTraversalKeysEnabled(false);
    	 ImageIcon ia = new ImageIcon(this.getClass().getResource("Dokistartscreen.png"));
		 backround = ia.getImage();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.BLACK);
		   	Graphics2D g2g = (Graphics2D)g;
		    g2g.drawImage(backround,1,1,this);
		    Graphics2D g4g = (Graphics2D)g;
		    Graphics2D g5g = (Graphics2D)g;
		    g4g.drawImage(characterspeaking3,characterspeaking3x,characterspeaking3y,this);
		    g4g.drawImage(characterspeaking2,characterspeaking2x,characterspeaking2y,this);
		    g4g.drawImage(characterspeaking4,characterspeaking4x,characterspeaking4y,this);
		    g5g.drawImage(textbox2,200,480,this);
		 
		    
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int c = e.getKeyCode();
		
		if(c == KeyEvent.VK_ENTER) {
			repaint();
			entertimes = entertimes + 1;
			System.out.println(entertimes);
			if(entertimes == 1) {
				ImageIcon ia = new ImageIcon(this.getClass().getResource("school.jpg"));
				backround = ia.getImage();
				JOptionPane.showMessageDialog(null, "You are now playing as Jake in firstperson view.");
				ImageIcon ib = new ImageIcon(this.getClass().getResource("newchris.png"));
				characterspeaking2 = ib.getImage();
				characterspeaking2x = characterspeaking2x + 220;
				ImageIcon ic = new ImageIcon(this.getClass().getResource("textbox1v.png"));
				textbox2 = ic.getImage();
				
			}
			if(entertimes == 2) 
				characterspeaking2 = null;
				characterspeaking2x = 20;
				ImageIcon ic = new ImageIcon(this.getClass().getResource("textbox2v.png"));
				textbox2 = ic.getImage();
			}
			if(entertimes == 3) {
				ImageIcon ib = new ImageIcon(this.getClass().getResource("newchris.png"));
				characterspeaking2 = ib.getImage();
				characterspeaking2x = characterspeaking2x + 220;
				ImageIcon ic = new ImageIcon(this.getClass().getResource("textbox3v.png"));
				textbox2 = ic.getImage();
			}
			//Jake speaks
			if(entertimes == 4) {
				characterspeaking2 = null;
				characterspeaking2x = 20;
				ImageIcon ic = new ImageIcon(this.getClass().getResource("textbox4v.png"));
				textbox2 = ic.getImage();
			}
			//Chris speaks
			if(entertimes == 5) {
				ImageIcon ib = new ImageIcon(this.getClass().getResource("newchris.png"));
				characterspeaking2 = ib.getImage();
				characterspeaking2x = characterspeaking2x + 220;
				ImageIcon ic = new ImageIcon(this.getClass().getResource("textbox5v.png"));
				textbox2 = ic.getImage();
			}
			//Jake speaks
			if(entertimes == 6) {
				characterspeaking2 = null;
				characterspeaking2x = 20;
				ImageIcon ic = new ImageIcon(this.getClass().getResource("textbox6v.png"));
				textbox2 = ic.getImage();
			}
			//narrator talks
			if(entertimes == 7) {
				ImageIcon ic = new ImageIcon(this.getClass().getResource("textbox7v.png"));
				textbox2 = ic.getImage();
			}
			//tidepod-chan talks
			if(entertimes == 8) {
				ImageIcon ib = new ImageIcon(this.getClass().getResource("tidepodchan.png"));
				characterspeaking3 = ib.getImage();
				characterspeaking3x = characterspeaking3x - 220;
				ImageIcon ic = new ImageIcon(this.getClass().getResource("textbox8v.png"));
				textbox2 = ic.getImage();
				eat = JOptionPane.showInputDialog("Eat tide-pod chan or not.(yes or no?)");
				if(eat.equals("yes")) {
					JOptionPane.showMessageDialog(null,"You are now convicted of murder and you go to jail.");
					JOptionPane.showMessageDialog(null,"GAME OVER.");
					ImageIcon id = new ImageIcon(this.getClass().getResource("Monikascare.png"));
    				backround = id.getImage();
					characterspeaking3 = null;
    				textbox2 = null;
    				Sound sounds;
					try {
						sounds = new Sound();
        				sounds.scream();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					final java.util.Timer t = new java.util.Timer();
			    	t.schedule(new TimerTask() {

			    	            @Override
			    	            public void run() {
			    	            System.exit(0);
			    	            	
			    	            t.cancel();
			    	   			t.purge();	    	   				
			    	            }            
			    	        }, 4000, 4000);
				
				
				}
				if(eat.equals("no")) {
					ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox9v.png"));
					textbox2 = ih.getImage();
					repaint();
				}
				//Chris talks
				
			}
			if(entertimes == 9) {
				characterspeaking3x = 580;
				ImageIcon id = new ImageIcon(this.getClass().getResource("newchris.png"));
				characterspeaking2 = id.getImage();
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox10v.png"));
				textbox2 = ih.getImage();
			}
			if(entertimes == 10) {
				characterspeaking2x = 20;
				ImageIcon id = new ImageIcon(this.getClass().getResource("tidepodchan.png"));
				characterspeaking3 = id.getImage();
				characterspeaking3x = characterspeaking3x - 220;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox11v.png"));
				textbox2 = ih.getImage();
			}
			//Jake speaks
			if(entertimes == 11) {
				characterspeaking3x = 580;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox12v.png"));
				textbox2 = ih.getImage();
			}
			//Tide pod chan speaks
			if(entertimes == 12) {
				characterspeaking3x = characterspeaking3x - 220;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox13v.png"));
				textbox2 = ih.getImage();
			}
			//Chris speaks
			if(entertimes == 13) {
				characterspeaking3x = 580;
				characterspeaking2x = characterspeaking2x + 220;
				ImageIcon id = new ImageIcon(this.getClass().getResource("newchris.png"));
				characterspeaking2 = id.getImage();
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox14v.png"));
				textbox2 = ih.getImage();
			}
			//Jake talks
			if(entertimes == 14) {
				characterspeaking2x = 20;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox15v.png"));
				textbox2 = ih.getImage();
			}
			//Tide-pod chan talks
			if(entertimes == 15) {
				characterspeaking3x = characterspeaking3x - 220;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox16v.png"));
				textbox2 = ih.getImage();	
			}
			//Chris speaks
			if(entertimes == 16) {
				characterspeaking3x = 580;
				characterspeaking2x = characterspeaking2x + 220;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox17v.png"));
				textbox2 = ih.getImage();	
			}
			//Jake speaks
			if(entertimes == 17) {
			    characterspeaking3x = 580;
			    characterspeaking2x = 20;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox18v.png"));
				textbox2 = ih.getImage();	
			}
			//Audrey speaks
			if(entertimes == 18) {
				ImageIcon id = new ImageIcon(this.getClass().getResource("Audrey.png"));
				characterspeaking4 = id.getImage();
				characterspeaking4x = characterspeaking4x - 520;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox19v.png"));
				textbox2 = ih.getImage();	
			}
			//Jake speaks
			if(entertimes == 19) {
				characterspeaking4x = 980;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox20v.png"));
				textbox2 = ih.getImage();		
			}
			//Audrey speaks
			if(entertimes == 20) {
				characterspeaking4x = characterspeaking4x - 520;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox21v.png"));
				textbox2 = ih.getImage();				
			}
			//Tide-pod chan speaks
			if(entertimes == 21) {
				characterspeaking4x = 980;
				characterspeaking3x = characterspeaking3x - 220;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox22v.png"));
				textbox2 = ih.getImage();						
			}
			//Audrey speaks
			if(entertimes == 22) {
				characterspeaking3x = characterspeaking3x + 220;
				characterspeaking4x = characterspeaking4x - 520;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox23v.png"));
				textbox2 = ih.getImage();	
			}
			//Jake speaks
			if(entertimes == 23) {
				characterspeaking4x = 980;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox24v.png"));
				textbox2 = ih.getImage();	
			}
			//Monika speaks(null everyone else in this piece of dialog)
			if(entertimes == 24) {
				characterspeaking2 = null;
				characterspeaking4 = null;
				ImageIcon ib = new ImageIcon(this.getClass().getResource("Monika.png"));
				characterspeaking3 = ib.getImage();
				characterspeaking3y = characterspeaking3y - 200;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox25v.png"));
				textbox2 = ih.getImage();	
			}
			//Tide-pod chan talks
			if(entertimes == 25) {
				ImageIcon ib = new ImageIcon(this.getClass().getResource("tidepodchan.png"));
				characterspeaking3 = ib.getImage();
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox26v.png"));
				textbox2 = ih.getImage();	
			}
			//Narrator talks(null everyone for this one)
			if(entertimes == 26) {
				characterspeaking3 = null;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox27v.png"));
				textbox2 = ih.getImage();		
			}
			//Monika talks(have everyone else with her)
			if(entertimes == 27) {
				ImageIcon ib = new ImageIcon(this.getClass().getResource("Monika.png"));
				characterspeaking3 = ib.getImage();
				ImageIcon id = new ImageIcon(this.getClass().getResource("Audrey.png"));
				characterspeaking4 = id.getImage();
				ImageIcon ic = new ImageIcon(this.getClass().getResource("newchris.png"));
				characterspeaking2 = ic.getImage();
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox28v.png"));
				textbox2 = ih.getImage();			
				
			}
			//Audrey talks
			if(entertimes == 28) {
				characterspeaking4x = characterspeaking4x - 520;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox29v.png"));
				textbox2 = ih.getImage();			
			}
			//Monika talks
			if(entertimes == 29) {
				characterspeaking4x = 980;
				characterspeaking3x = characterspeaking3x - 220;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox30v.png"));
				textbox2 = ih.getImage();				
			}
			//Jake talks
			if(entertimes == 30) {
				characterspeaking3x = 580;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox31v.png"));
				textbox2 = ih.getImage();				
			}
			//
			//Chris talks
			if(entertimes == 31) {
				characterspeaking2x = characterspeaking2x + 220;
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox32v.png"));
				textbox2 = ih.getImage();		
			}
			//Monika talks
			if(entertimes == 32) {
				characterspeaking2x = 20;
				characterspeaking3x = characterspeaking3x - 220;
				
				ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox33v.png"));
				textbox2 = ih.getImage();		
			}
			//choice
			if(entertimes == 33) {
				
				choice2 = JOptionPane.showInputDialog("Join the Writing club?(yes,or no)");
			    textbox2 = null;
			}
			if(choice2.equals("yes")) {
				//Chris talks.
				if(entertimes == 34) {
					characterspeaking2x = characterspeaking2x + 220;
					ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox33.png"));
					textbox2 = ih.getImage();	
				}
				//Monika talks!
				if(entertimes == 35) {
					characterspeaking2x = 20;
					characterspeaking3x = characterspeaking3x - 220;
					ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox34.png"));
					textbox2 = ih.getImage();	
				}
				if(entertimes == 36) {
					textbox2 = null;
					JOptionPane.showMessageDialog(null, "Thank you for playing the DEMO of Doki Doki Overtext!");
					JOptionPane.showMessageDialog(null, "Hope you Enjoyed! Goodbye");
					System.exit(1);
				}
			}
			if(choice2.equals("no")) {
				//Use textbox1no
				//Jake talks
				if(entertimes == 33) {
					characterspeaking3x = 580;
					ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox1no.png"));
					textbox2 = ih.getImage();		
				}
				//Use textbox2no
				//Chris talks
				if(entertimes == 34) {
					characterspeaking2x = characterspeaking2x + 220;
					ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox2no.png"));
					textbox2 = ih.getImage();		
				}
				//textbox3no
				//Jake talks
				if(entertimes == 35) {
					characterspeaking2x = 20;
					ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox3no.png"));
					textbox2 = ih.getImage();		
				}
				//Monika talks
				if(entertimes == 36) {
					characterspeaking4 = null;
					ImageIcon ia = new ImageIcon(this.getClass().getResource("hellclassroom.jpg"));
					backround = ia.getImage();
					ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox4no.png"));
					textbox2 = ih.getImage();		
				}
				//Chris talks
				if(entertimes == 37) {
					characterspeaking2x = characterspeaking2x + 220;
					ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox5no.png"));
					textbox2 = ih.getImage();		
				}
				//Jake talks
				if(entertimes == 38) {
					characterspeaking2 = null;
					ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox6no.png"));
					textbox2 = ih.getImage();		
				}
				//Uganda Knuckles
				if(entertimes == 39) {
					ImageIcon ib = new ImageIcon(this.getClass().getResource("knuckles.png"));
					characterspeaking2 = ib.getImage();
					ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox7no.png"));
					textbox2 = ih.getImage();		
				}
				
				//Jake talks
				if(entertimes == 40) {
					characterspeaking2 = null;
					ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox8no.png"));
					textbox2 = ih.getImage();				
				}
				//Chris talks
				if(entertimes == 41) {
					ImageIcon ib = new ImageIcon(this.getClass().getResource("newchris.png"));
					characterspeaking2 = ib.getImage();
					ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox9no.png"));
					textbox2 = ih.getImage();			
				}
				//choice
				if(entertimes == 42) {
					characterspeaking2 = null;
					ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox10no.png"));
					textbox2 = ih.getImage();				
				}
				//shrek speaks
				if(entertimes == 43) {
					ImageIcon ib = new ImageIcon(this.getClass().getResource("Shrekboy.png"));
					characterspeaking2 = ib.getImage();
					ImageIcon ic = new ImageIcon(this.getClass().getResource("snoopdogg.gif"));
					characterspeaking3 = ic.getImage();
					ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox11no.png"));
					textbox2 = ih.getImage();			
				}
				if(entertimes == 44) {
					ImageIcon ih = new ImageIcon(this.getClass().getResource("textbox12no.png"));
					textbox2 = ih.getImage();			
				}
				if(entertimes == 45) {
					ImageIcon ia = new ImageIcon(this.getClass().getResource("Dokistartscreenmeme.png"));
					backround = ia.getImage();
					characterspeaking3 = null;
					textbox2 = null;
					characterspeaking2 = null;
					 Sound sound;
						try {
							sound = new Sound();
							 sound.staticsound();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				}
				if(entertimes == 46) {
					ImageIcon ia = new ImageIcon(this.getClass().getResource("memeworld.gif"));
					backround = ia.getImage();
					characterspeaking3 = null;
					textbox2 = null;
					JOptionPane.showMessageDialog(null, "This place is magical!");
					JOptionPane.showMessageDialog(null, "Im going to stay here forever!");
					JOptionPane.showMessageDialog(null,"Meme Ending");
					
				}
		
			}
			
		}
	
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}

