package arcade;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UpTrigger extends Varibles implements KeyListener{
    public Image portal1;
    public Image portal2;
    public Image bullet;
    public int bulletx = 172;
    public int bullety = 670;
    public boolean right = false;
    public boolean left = true;
    public boolean bulletright = false;
    public boolean bulletleft = false;
	public void frames() {
		UpTrigger open = new UpTrigger();
		JFrame frame = new JFrame();
		frame.setSize(1543,869);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(open);
		frame.setVisible(true);
		frame.setResizable(true);
	}
	public void MoveBullet() {

	}
	public void check() {
		
	}
	public UpTrigger() {
		addKeyListener(this);
	 	setFocusable(true);
    	setFocusTraversalKeysEnabled(false);
    	ImageIcon ia = new ImageIcon(this.getClass().getResource("Level1.png"));
		background1 = ia.getImage();
		ImageIcon ib = new ImageIcon(this.getClass().getResource("Character1.png"));
		character1 = ib.getImage();
		ImageIcon ic = new ImageIcon(this.getClass().getResource("monster.gif"));
		monster = ic.getImage();
		ImageIcon ig = new ImageIcon(this.getClass().getResource("monster.gif"));
		monster2 = ig.getImage();
		ImageIcon ih = new ImageIcon(this.getClass().getResource("monster.gif"));
		monster3 = ih.getImage();
		ImageIcon ij = new ImageIcon(this.getClass().getResource("monster.gif"));
		monster4 = ij.getImage();
		ImageIcon id = new ImageIcon(this.getClass().getResource("portal.gif"));
		portal1 = id.getImage();
		ImageIcon ie = new ImageIcon(this.getClass().getResource("portal.gif"));
		portal2 = ie.getImage();
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.BLACK);
		g.drawImage(background1,0,0,this);
		g.drawImage(character1, characterx,charactery,this);
		g.drawImage(monster,monsterx,monstery,this);
		g.drawImage(monster2,monster2x,monster2y,this);
		g.drawImage(monster3,monster3x,monster3y,this);
		g.drawImage(monster4,monster4x,monster4y,this);
		g.drawImage(portal1,1250,730,this);
		g.drawImage(portal2,1170,134,this);
		g.drawImage(bullet, bulletx, bullety,this);
		
        if(left == true) {
    	          if(monsterx > monsterxlimitl && monster2x > monsterxlimit2l && monster3x > monsterxlimit3l && monster4x > monsterxlimit4l) {
	                monsterx = monsterx - 1;
	                monster2x = monster2x - 1;
	                monster3x = monster3x - 1;
	                monster4x = monster4x - 1;
	                repaint();
    	             }
    	            }
	            if(monsterx == monsterxlimitl && monster2x == monsterxlimit2l && monster3x == monsterxlimit3l && monster4x == monsterxlimit4l) {
	             right = true;
            	 left = false;
             }
    	     
	            if(right == true) {
	            	 if(monsterx < monsterxlimitr && monster2x < monsterxlimit2r && monster3x < monsterxlimit3r && monster4x < monsterxlimit4r) {
	    	                monsterx = monsterx + 1;
	    	                monster2x = monster2x + 1;
	    	                monster3x = monster3x + 1;
	    	                monster4x = monster4x + 1;
	    	                repaint();
	    	             }
	            }
    	            if(monsterx == monsterxlimitr && monster2x == monsterxlimit2r && monster3x == monsterxlimit3r && monster4x == monsterxlimit4r) {
     	            	 right = false;
     	            	 left = true;
     	             }
    	            if(bulletx > monster2x - 60 && bulletx > monster2y - 60 && bulletx < monster2y + 60) {
    	    	    	monster2 = null;
    	    	    }
    	           
    	    	    if(bulletx > monsterx - 60 && bulletx > monstery - 60 && bulletx < monstery + 60) {
    	    	    	monster = null;
    	    	    }
    	    	    if(bulletx > monster3x - 60 && bulletx > monster3y - 60 && bulletx < monster3y + 60 ) {
    	    	    	monster3 = null;
    	    	    }
    	    	    if(bulletx > monster4x - 60 && bulletx > monster4y - 60 && bulletx < monster4y + 60 ) {
    	    	    	monster4 = null;
    	    	    }
    	    	    
	
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int c = e.getKeyCode();
		//Jump up three
		if(charactery == 580 && characterx == 362) {
			charactery = 548;
		}
		//Jump up two
		if(charactery == 608 && characterx == 706) {
			charactery = 580;
		}
		//Jump up one
		if(charactery == 628 && characterx == 1042) {
			charactery = 608;
		}
		//portal enter 2
		if(charactery == 18) {
			if(characterx > 674) {
				characterx = characterx - 20;
			}
		}
		//portal 1 enter 
		if(characterx == 1082 && charactery > 108 && charactery < 140) {
			characterx = 674;
			charactery = 18;
		}
		//When player reaches the portal,this message will show up.
		if(characterx == 310 && charactery == 18){
			JOptionPane.showMessageDialog(null, "YOU DID IT.");
		}
		if(c == KeyEvent.VK_D) {
			bulletright = false;
			bulletleft = true;
			bullet = null;
			characterx = characterx + 8;
			System.out.print("x:");
			System.out.println(characterx);
			ImageIcon ib = new ImageIcon(this.getClass().getResource("Character1.png"));
			character1 = ib.getImage();
			repaint();
			System.out.println(characterx);
			if(characterx == 1194 && charactery == 708) {
				charactery = 628;
			}
			
		}
		if(characterx >= 1234) {
			characterx = characterx - 20;
		}
		if(c == KeyEvent.VK_A) {
			bulletright = true;
			bulletleft = false;
			bullet = null;
			characterx = characterx - 8;
			System.out.print("x:");
			System.out.println(characterx);
		    ImageIcon ib = new ImageIcon(this.getClass().getResource("characterleft.png"));
			character1 = ib.getImage();
			repaint();
		}
		/**if(c == KeyEvent.VK_W) {
			charactery = charactery - 30;
			System.out.print("y:");
			System.out.println(charactery);
			
			}
			**/
	    if(c == KeyEvent.VK_SPACE) {
	    	bulletx = characterx;
			bullet = null;
	        bullety = charactery - 38;
			if(bulletleft == true) {
	        bulletright = false;
	        bullety = charactery - 38;
	    	final java.util.Timer a = new java.util.Timer();
	    	a.schedule(new TimerTask() {

	    	            @Override
	    	            public void run() {
	    	            	ImageIcon ib = new ImageIcon(this.getClass().getResource("bulletleft.png"));
	    	        		bullet = ib.getImage();
	    	        		bulletx = bulletx + 8;
	    	        		repaint();    	   				
	    	            }            
	    	        }, 200, 200);
	    	repaint();
	    	}

	    		final java.util.Timer a = new java.util.Timer();
		    	a.schedule(new TimerTask() {
    	        @Override
    	        public void run() {
    		    if(bulletright == true) {
    		    	ImageIcon ib = new ImageIcon(this.getClass().getResource("bulletright.png"));
            		bullet = ib.getImage();
            		bulletx = bulletx - 8;
            		repaint();  
        	        	
    		    }
    	    	if(bulletleft == true) {
    		    ImageIcon ib = new ImageIcon(this.getClass().getResource("bulletleft.png"));
        		bullet = ib.getImage();
        		bulletx = bulletx + 1;
        		repaint();    	   	
    	    	}
	    		}
		        }, 200, 200);
	    	
	    }
	
		}
		
	

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
