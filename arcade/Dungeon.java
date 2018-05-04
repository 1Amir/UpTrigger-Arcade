package arcade;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Dungeon extends JPanel implements KeyListener{
	private Image bossimage;
	public boolean thing = true;
	public int diagnol = 1;
	public int bossx = 500;
	public int bossy =  450;
	public int bossxvelocity;
	public int bossxyvelocity;
	public int square2x = 500;
	public int square2y = 500;
	public int square3x = 500;
	public int square3y = 500;
	public int square4x = 500;
	public int square4y = 500;
	public boolean bigdragon = false;
	public boolean boss = false;
	public int threerooms = 0;
	public int monsterskilled = 0;
	public int monsterskilled2 = 0; 
	public boolean healthbar;
	public int healthbarwidth = 500;
	public int healthbarheight = 30;
	//square dungeon 1 integers
	public int square1x = 500;
	public int square1y = 500;
	//allows something
	public boolean gamestart2 = false;
	//integer amount for the heart the character has 
	public int hearts = 3;
	//heart Icon for character
	private Image heart;
	private Image heart2;
	private Image heart3;
	//background Image varible
	private Image background;
	//sword Image varible
	private Image sword;
	//character Image varible
	private Image character;
	//arrow Image varible
	private Image arrow;
	//velocity for the creatures random movement
	public boolean drawsquare2 = false;
	public boolean drawsquare3 = false;
	public boolean drawsquare4 = false;
	public int xVelocity;
	public int yVelocity;
	public int x2Velocity;
	public int y2Velocity;
	public int x3Velocity;
	public int y3Velocity;
	public int x4Velocity;
	public int y4Velocity;
	public int x5Velocity;
	public int y5Velocity;
	public int x6Velocity;
	public int y6Velocity;
	public int x7Velocity;
	public int y7Velocity;
	public int x8Velocity;
	public int y8Velocity;
	public int x9Velocity;
	public int y9Velocity;
	public int x10Velocity;
	public int y10Velocity;
	public boolean dungeon1end = false;
	//to check if a monster is dead
	public boolean monster1dead = false;
	public boolean monster2dead = false;
	public boolean monster3dead = false;
	public boolean monster4dead = false;
	public boolean monster5dead = false;
	public boolean monster6dead = false;
	public boolean monster7dead = false;
	public boolean monster8dead = false;
	public boolean monster9dead = false;
	public boolean monster10dead = false;
	//to specify wether the character can go back from an entrance
	public boolean allowedtogoback = false;
	//Image varible for me and Wyatt
	private Image wyattandamir;
	//monster Image varibles
	private Image bully1;
	private Image bully2;
	private Image bully3;
	private Image bully4;
	private Image bully5;
	private Image bully6;
	private Image bully7;
	private Image bully8;
	private Image bully9;
	private Image bully10;
	//screen number to give sceniro's for each screen
	public int screens = 1;
	//check if character had gotten a certain red sword
	public boolean gotsword = false;
	//the varible that will determine which Image the sword should be in
	public int sworddirection = 0;
	//To check if the character died
	public boolean death = false;
	//character's x and y
	public int x = 0;
	public int y = 600;
	//enemy's x and y
	public int enemyx;
	public int enemyy;
	public int enemy2x;
	public int enemy2y;
	public int enemy3x;
	public int enemy3y;
	public int enemy4x;
	public int enemy4y;
	public int enemy5x;
	public int enemy5y;
	public int enemy6x;
	public int enemy6y;
	public int enemy7x;
	public int enemy7y;
	public int enemy8x;
	public int enemy8y;
	public int enemy9x;
	public int enemy9y;
	public int enemy10x;
	public int enemy10y;
	public int saythis = 1;

	//to check if the gamestarted
	public boolean gamestart = false;
	//the x and y value for the sword
	public int swordgifx = x;
	public int swordgify = y;
	//the x and y value for the hitbox
	public int hitboxx = swordgifx + 30;
	public int hitboxy = swordgify;	
	//calling the method that will start the game
	//Window creater
	public void run(){
		Dungeon open = new Dungeon();
		JFrame frame = new JFrame();
		frame.setSize(1500,820);
	    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    frame.getContentPane().add(open);
		frame.setVisible(true);
		frame.setResizable(true);
	}
	public Dungeon() {
		addKeyListener(this);
	 	setFocusable(true);
    	setFocusTraversalKeysEnabled(false);
    	repaint();
	}
	//Key input
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int c = e.getKeyCode();
			   if(c == KeyEvent.VK_SPACE){
				   //the sword will go left
				  if(boss == false){
				   if(sworddirection == 1){ 
					   ImageIcon ic = new ImageIcon(this.getClass().getResource("swordleft.gif"));
					   sword = ic.getImage();
					   if(bigdragon == true){
						   if(enemyx == swordgifx || enemyx < swordgifx && enemyx > swordgifx - 500 && swordgify > enemyy - 500  && swordgify < enemyy + 500){
							   bully1 = null;
							   monster1dead = true;
							   enemyx = 2000;
							   enemyy = 2000;
							   if(screens == 9 || screens == 10 || screens == 11){
								   monsterskilled = monsterskilled + 1;
							   }
							   if(screens == 7){
								   monsterskilled2 = monsterskilled2 + 1;
							   }
						   }
					   }
					   if(enemyx == swordgifx || enemyx < swordgifx && enemyx > swordgifx - 70 && swordgify > enemyy - 70  && swordgify < enemyy + 70){
						   bully1 = null;
						   monster1dead = true;
						   enemyx = 2000;
						   enemyy = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }

					   if(enemy2x == swordgifx || enemy2x < swordgifx && enemy2x > swordgifx - 70 && swordgify > enemy2y - 70  && swordgify < enemy2y + 70){
						   bully2 = null;
						   monster2dead = true;
						   enemy2x = 2000;
						   enemy2y = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						
						   }
					   }
					   if(enemy3x == swordgifx || enemy3x < swordgifx && enemy3x > swordgifx - 70 && swordgify > enemy3y - 70  && swordgify < enemy3y + 70){
						   bully3 = null;
						   monster3dead = true;
						   enemy3x = 2000;
						   enemy3y = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(enemy4x == swordgifx || enemy4x < swordgifx && enemy4x > swordgifx - 70 && swordgify > enemy4y - 70  && swordgify < enemy4y + 70){
						   bully4 = null;
						   monster4dead = true;
						   enemy4x = 2000;
						   enemy4y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(enemy5x == swordgifx || enemy5x < swordgifx && enemy5x > swordgifx - 70 && swordgify > enemy5y - 70  && swordgify < enemy5y + 70){
						   bully5 = null;
						   monster5dead = true;
						   enemy5x = 2000;
						   enemy5y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   
					   if(enemy6x == swordgifx || enemy6x < swordgifx && enemy6x > swordgifx - 70 && swordgify > enemy6y - 70  && swordgify < enemy6y + 70){
						   bully6 = null;
						   monster6dead = true;
						   enemy6x = 2000;
						   enemy6y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(enemy7x == swordgifx || enemy7x < swordgifx && enemy7x > swordgifx - 70 && swordgify > enemy7y - 70  && swordgify < enemy7y + 70){
						   bully7 = null;
						   monster7dead = true;
						   enemy7x = 2000;
						   enemy7y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(enemy8x == swordgifx || enemy8x < swordgifx && enemy8x > swordgifx - 70 && swordgify > enemy8y - 70  && swordgify < enemy8y + 70){
						   bully8 = null;
						   monster8dead = true;
						   enemy8x = 2000;
						   enemy8y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(enemy9x == swordgifx || enemy9x < swordgifx && enemy9x > swordgifx - 70 && swordgify > enemy9y - 70  && swordgify < enemy9y + 70){
						   bully9 = null;
						   monster9dead = true;
						   enemy9x = 2000;
						   enemy9y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(enemy10x == swordgifx || enemy10x < swordgifx && enemy10x > swordgifx - 70 && swordgify > enemy10y - 70  && swordgify < enemy10y + 70){
						   bully10 = null;
						   monster10dead = true;
						   enemy10x = 2000;
						   enemy10y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
				   }
				   //the sword will go down
				   if(sworddirection == 2){
					   ImageIcon ic = new ImageIcon(this.getClass().getResource("sworddown.gif"));
					   sword = ic.getImage();
					   swordgifx = swordgifx + 26;
					   swordgify = swordgify + 80;
					   if(bigdragon == true){
						   if(swordgify < enemyy + 500 && swordgify > enemyy - 500 && swordgifx > enemyx - 500 && swordgifx < enemyx + 500 ){
							   bully1 = null;
							   monster1dead = true;
							   enemyx = 2000;
							   enemyy = 2000;
							   if(screens == 9 || screens == 10 || screens == 11){
								   monsterskilled = monsterskilled + 1;
							   }
						   }
					   }
					   if(swordgify < enemyy + 70 && swordgify > enemyy - 70 && swordgifx > enemyx - 70 && swordgifx < enemyx + 70 ){
						   bully1 = null;
						   monster1dead = true;
						   enemyx = 2000;
						   enemyy = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgify < enemy2y + 100 && swordgify > enemy2y - 100 && swordgifx > enemy2x - 120 && swordgifx < enemy2x + 120 ){
						   bully2 = null;
						   monster1dead = true;
						   enemy2x = 2000;
						   enemy2y = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgify < enemy3y + 70 && swordgify > enemy3y - 70 && swordgifx > enemy3x - 70 && swordgifx < enemy3x + 70 ){
						   bully3 = null;
						   monster3dead = true;
						   enemy3x = 2000;
						   enemy3y = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }   
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
						   
					   }
					   if(swordgify < enemy4y + 100 && swordgify > enemy4y - 100 && swordgifx > enemy4x - 120 && swordgifx < enemy4x + 120 ){
						   bully4 = null;
						   monster4dead = true;
						   enemy4x = 2000;
						   enemy4y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgify < enemy5y + 70 && swordgify > enemy5y - 70 && swordgifx > enemy5x - 70 && swordgifx < enemy5x + 70 ){
						   bully5 = null;
						   monster5dead = true;
						   enemy5x = 2000;
						   enemy5y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgify < enemy6y + 100 && swordgify > enemy6y - 100 && swordgifx > enemy6x - 120 && swordgifx < enemy6x + 120 ){
						   bully6 = null;
						   monster6dead = true;
						   enemy6x = 2000;
						   enemy6y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgify < enemy7y + 70 && swordgify > enemy7y - 70 && swordgifx > enemy7x - 70 && swordgifx < enemy7x + 70 ){
						   bully7 = null;
						   monster7dead = true;
						   enemy7x = 2000;
						   enemy7y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgify < enemy8y + 100 && swordgify > enemy8y - 100 && swordgifx > enemy8x - 120 && swordgifx < enemy8x + 120 ){
						   bully8 = null;
						   monster8dead = true;
						   enemy8x = 2000;
						   enemy8y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgify < enemy9y + 70 && swordgify > enemy9y - 70 && swordgifx > enemy9x - 70 && swordgifx < enemy9x + 70 ){
						   bully9 = null;
						   monster9dead = true;
						   enemy9x = 2000;
						   enemy9y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgify < enemy10y + 100 && swordgify > enemy10y - 100 && swordgifx > enemy10x - 120 && swordgifx < enemy10x + 120 ){
						   bully10 = null;
						   monster10dead = true;
						   enemy10x = 2000;
						   enemy10y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
				   }
				   //up attack
				   if(sworddirection == 3){
					   swordgifx = swordgifx + 26;
					   swordgify = swordgify - 50;
					   if(swordgifx < enemyx + 10 && swordgifx > enemyx){
						   bully1 = null;
						   monster1dead = true;
						   enemyx = 2500;
						   enemyy = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgifx < enemy2x + 10 && swordgifx > enemy2x){
						   bully2 = null;
						   monster2dead = true;
						   enemy2x = 2500;
						   enemy2y = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }  
					   if(swordgifx < enemy3x + 10 && swordgifx > enemy3x){
						   bully3 = null;
						   monster3dead = true;
						   enemy3x = 2500;
						   enemy3y = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgifx < enemy4x + 10 && swordgifx > enemy4x){
						   bully4 = null;
						   monster4dead = true;
						   enemy4x = 2500;
						   enemy4y = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgifx < enemy5x + 10 && swordgifx > enemy5x){
						   bully5 = null;
						   monster5dead = true;
						   enemy5x = 2500;
						   enemy5y = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgifx < enemy6x + 10 && swordgifx > enemy6x){
						   bully6 = null;
						   monster6dead = true;
						   enemy6x = 2500;
						   enemy6y = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgifx < enemy7x + 10 && swordgifx > enemy7x){
						   bully7 = null;
						   monster7dead = true;
						   enemy7x = 2500;
						   enemy7y = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgifx < enemy8x + 10 && swordgifx > enemy8x){
						   bully8 = null;
						   monster8dead = true;
						   enemy8x = 2500;
						   enemy8y = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgifx < enemy9x + 10 && swordgifx > enemy9x){
						   bully9 = null;
						   monster9dead = true;
						   enemy9x = 2500;
						   enemy9y = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgifx < enemy10x + 10 && swordgifx > enemy10x){
						   bully10 = null;
						   monster10dead = true;
						   enemy10x = 2500;
						   enemy10y = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
				   }
				   //the sword willgo right
				   if(sworddirection == 4){
					   ImageIcon ic = new ImageIcon(this.getClass().getResource("swordright.gif"));
					   sword = ic.getImage();
					   swordgifx = swordgifx + 70;
					   if(swordgifx > enemyx && swordgifx < enemyx + 120 && swordgify > enemyy - 100  && swordgify < enemyy + 100){
						   bully1 = null;
						   monster1dead = true;
						   enemyx = 2500;
						   enemyy = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgifx > enemy2x && swordgifx < enemy2x + 120 && swordgify > enemy2y - 100  && swordgify < enemy2y + 100){
						   bully2 = null;
						   monster2dead = true;
						   enemy2x = 2500;
						   enemy2y = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgifx > enemy3x && swordgifx < enemy3x + 120 && swordgify > enemy3y - 100  && swordgify < enemy3y + 100){
						   bully3 = null;
						   monster3dead = true;
						   enemy3x = 2500;
						   enemy3y = 2000;
						   if(screens == 9 || screens == 10 || screens == 11){
							   monsterskilled = monsterskilled + 1;
						   }
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgifx > enemy4x && swordgifx < enemy4x + 120 && swordgify > enemy4y - 100  && swordgify < enemy4y + 100){
						   bully4 = null;
						   monster4dead = true;
						   enemy4x = 2500;
						   enemy4y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgifx > enemy5x && swordgifx < enemy5x + 120 && swordgify > enemy5y - 100  && swordgify < enemy5y + 100){
						   bully5 = null;
						   monster5dead = true;
						   enemy5x = 2500;
						   enemy5y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgifx > enemy6x && swordgifx < enemy6x + 120 && swordgify > enemy6y - 100  && swordgify < enemy6y + 100){
						   bully6 = null;
						   monster6dead = true;
						   enemy6x = 2500;
						   enemy6y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   } 
					   if(swordgifx > enemy7x && swordgifx < enemy7x + 120 && swordgify > enemy7y - 100  && swordgify < enemy7y + 100){
						   bully7 = null;
						   monster7dead = true;
						   enemy7x = 2500;
						   enemy7y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgifx > enemy8x && swordgifx < enemy8x + 120 && swordgify > enemy8y - 100  && swordgify < enemy8y + 100){
						   bully8 = null;
						   monster8dead = true;
						   enemy8x = 2500;
						   enemy8y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgifx > enemy9x && swordgifx < enemy9x + 120 && swordgify > enemy9y - 100  && swordgify < enemy9y + 100){
						   bully9 = null;
						   monster9dead = true;
						   enemy9x = 2500;
						   enemy9y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
					   if(swordgifx > enemy10x && swordgifx < enemy10x + 120 && swordgify > enemy10y - 100  && swordgify < enemy10y + 100){
						   bully10 = null;
						   monster10dead = true;
						   enemy10x = 2500;
						   enemy10y = 2000;
						   if(screens == 7){
							   monsterskilled2 = monsterskilled2 + 1;
						   }
					   }
				   }   
				  }
				  if(boss == true){
					   if(sworddirection == 1){ 
						   ImageIcon ic = new ImageIcon(this.getClass().getResource("swordleft.gif"));
						   sword = ic.getImage();
						   if(x > bossx - 120 && x < bossx + 120 && y < bossy + 120 && y > bossy - 120)
						   {
							   bossx = bossx - 60;
									   
									   
							   healthbarwidth = healthbarwidth - 10;
						   }
					   }
					   if(sworddirection == 2){
						   ImageIcon ic = new ImageIcon(this.getClass().getResource("sworddown.gif"));
						   sword = ic.getImage();
						   swordgifx = swordgifx + 26;
						   swordgify = swordgify + 80;
						   if(x > bossx - 120 && x < bossx + 120 && y < bossy + 120 && y > bossy - 120)
						   {
							   bossy = bossy + 50;
							   healthbarwidth = healthbarwidth - 10;
						   }
					   }
					   if(sworddirection == 3){
						   swordgifx = swordgifx + 26;
						   swordgify = swordgify - 50;
						   if(swordgifx < bossx + 10 && swordgifx > bossx){
							   bossy = bossy - 50;
							   healthbarwidth = healthbarwidth - 10;
						   }
					   }
					   if(sworddirection == 4){
						   ImageIcon ic = new ImageIcon(this.getClass().getResource("swordright.gif"));
						   sword = ic.getImage();
						   swordgifx = swordgifx + 70;
						   if(x > bossx - 120 && x < bossx + 120 && y < bossy + 120 && y > bossy - 120)
						   {
							   bossx = bossx + 50;
							   healthbarwidth = healthbarwidth - 10;
						   }
					   }
				  }
			   }
			
			//loading the graphics
			if(c == KeyEvent.VK_C){
				 ImageIcon ib = new ImageIcon(this.getClass().getResource("firstscreen.jpg"));
				 background = ib.getImage();
				 ImageIcon ie = new ImageIcon(this.getClass().getResource("heart.gif"));
				 heart = ie.getImage();
				 ImageIcon ih = new ImageIcon(this.getClass().getResource("heart.gif"));
				 heart2 = ih.getImage();
				 ImageIcon ii = new ImageIcon(this.getClass().getResource("heart.gif"));
				 heart3 = ii.getImage();
				 ImageIcon ic = new ImageIcon(this.getClass().getResource("sword.gif"));
				 sword = ic.getImage();
				 ImageIcon ia = new ImageIcon(this.getClass().getResource("square.gif"));
				 character = ia.getImage();
				 ImageIcon id = new ImageIcon(this.getClass().getResource("arrow.gif"));
				 arrow = id.getImage();			
			}

			//level going.
			//The character will go left
			if(c == KeyEvent.VK_D){
				x = x + 4;
				swordgifx = swordgifx + 4;
				hitboxx = hitboxx + 4;
				System.out.print("x:");
				System.out.println(x);	
				sworddirection = 4;
				if(allowedtogoback == false){
				if(x == 1449 || x > 1449){
					x = x - 20;
					swordgifx = swordgifx - 20;
					hitboxx = hitboxx - 20;	
				}
				}
		
				}
				//the character will go right
				if(c == KeyEvent.VK_A){
					swordgifx = swordgifx - 4;
					x = x - 4;
					hitboxx = hitboxx - 4;
					sworddirection = 1;
					System.out.print("x:");
					System.out.println(x);
				}
				//the character will go up
				if(c == KeyEvent.VK_W){
					y = y - 4;
					swordgify = swordgify - 4;
					hitboxy = hitboxy - 4;
					System.out.print("y:");
					System.out.println(y);	
					sworddirection = 3;
					
						
				}
				//the character will go down
				if(c == KeyEvent.VK_S){
				
					swordgify = swordgify + 4;
					y = y + 4;
					sworddirection = 2;
					hitboxy = hitboxy + 4;
					System.out.print("y:");
					System.out.println(y);
					gamestart = true;
				}
				//monster killing character 
				if(boss == false){
				if(monster1dead == false){
				if(enemyx > x - 20 && enemyx < x + 20 && enemyy > y - 20 && enemyy < y + 20 ){
					hearts = hearts - 1;
					x = x - 50;
					if(hearts == 2){
						heart3 = null;
					}
					if(hearts == 1){
						heart2 = null;
					}
					if(hearts == 0){
					 heart = null;
					 JOptionPane.showMessageDialog(null,"You are dead");
					 System.exit(0);
					}
				}
				
				}
				if(monster2dead == false){
				if(enemy2x > x - 20 && enemy2x < x + 20 && enemy2y > y - 20 && enemy2y < y + 20 ){
					hearts = hearts - 1;
					x = x - 50;
					if(hearts == 2){
						heart3 = null;
					}
					if(hearts == 1){
						heart2 = null;
					}
					if(hearts == 0){
					 heart = null;
					 JOptionPane.showMessageDialog(null,"You are dead");
					 System.exit(0);
					}
				}
				
				
				}
					if(enemy3x > x - 20 && enemy3x < x + 20 && enemy3y > y - 20 && enemy3y < y + 20 ){
						hearts = hearts - 1;
						x = x - 50;
						if(hearts == 2){
							heart3 = null;
						}
						if(hearts == 1){
							heart2 = null;
						}
						if(hearts == 0){
						 heart = null;
						 JOptionPane.showMessageDialog(null,"You are dead");
						 System.exit(0);
						}
					
					
					}
					if(enemy4x > x - 20 && enemy4x < x + 20 && enemy4y > y - 20 && enemy4y < y + 20 ){
						hearts = hearts - 1;
						x = x - 50;
						if(hearts == 2){
							heart3 = null;
						}
						if(hearts == 1){
							heart2 = null;
						}
						if(hearts == 0){
						 heart = null;
						 JOptionPane.showMessageDialog(null,"You are dead");
						 System.exit(0);
						}
						
					
					}
						if(enemy5x > x - 20 && enemy5x < x + 20 && enemy5y > y - 20 && enemy5y < y + 20 ){
							hearts = hearts - 1;
							x = x - 50;
							if(hearts == 2){
								heart3 = null;
							}
							if(hearts == 1){
								heart2 = null;
							}
							if(hearts == 0){
							 heart = null;
							 JOptionPane.showMessageDialog(null,"You are dead");
							 System.exit(0);
							}
						}
					
						
						if(enemy6x > x - 30 && enemy6x < x + 30 && enemy6y > y - 30 && enemy6y < y + 30 ){
							hearts = hearts - 1;
							x = x - 50;
							if(hearts == 2){
								heart3 = null;
							}
							if(hearts == 1){
								heart2 = null;
							}
							if(hearts == 0){
							 heart = null;
							 JOptionPane.showMessageDialog(null,"You are dead");
							 System.exit(0);
							}
						}
						
						
							if(enemy7x > x - 30 && enemy7x < x + 30 && enemy7y > y - 30 && enemy7y < y + 30 ){
								hearts = hearts - 1;
								x = x - 50;
								if(hearts == 2){
									heart3 = null;
								}
								if(hearts == 1){
									heart2 = null;
								}
								if(hearts == 0){
								 heart = null;
								 JOptionPane.showMessageDialog(null,"You are dead");
								 System.exit(0);
								}
							}
							
							
							if(enemy8x > x - 30 && enemy8x < x + 30 && enemy8y > y - 30 && enemy8y < y + 30 ){
								hearts = hearts - 1;
								x = x - 50;
								if(hearts == 2){
									heart3 = null;
								}
								if(hearts == 1){
									heart2 = null;
								}
								if(hearts == 0){
								 heart = null;
								 JOptionPane.showMessageDialog(null,"You are dead");
								 System.exit(0);
								}
							
							}
							
								if(enemy9x > x - 30 && enemy9x < x + 30 && enemy9y > y - 30 && enemy9y < y + 30 ){
									hearts = hearts - 1;
									x = x - 50;
									if(hearts == 2){
										heart3 = null;
									}
									if(hearts == 1){
										heart2 = null;
									}
									if(hearts == 0){
									 heart = null;
									 JOptionPane.showMessageDialog(null,"You are dead");
									 System.exit(0);
									}
								
							
								}
								if(enemy10x > x - 30 && enemy10x < x + 30 && enemy10y > y - 30 && enemy10y < y + 30 ){
									hearts = hearts - 1;
									x = x - 50;
									if(hearts == 2){
										heart3 = null;
									}
									if(hearts == 1){
										heart2 = null;
									}
									if(hearts == 0){
									 heart = null;
									 JOptionPane.showMessageDialog(null,"You are dead");
									 System.exit(0);
									}
								
								}
								}
				if(boss == true){
					if(bossy > 800){
						bossy = 500;
					}
					if(x > bossx - 60 && x < bossx + 60 && y < bossy + 60 && y > bossy - 60){
						hearts = hearts - 1;
						x = x - 50;
						if(hearts == 2){
							heart3 = null;
						}
						if(hearts == 1){
							heart2 = null;
						}
						if(hearts == 0){
						 heart = null;
						 JOptionPane.showMessageDialog(null,"You are dead");
						 System.exit(0);
						
					}
					}
				}
				if(y == 764 && x > 64 && x < 1304){
					y = y - 20;
				}
				if(enemyy == 524  && enemyx > 64 && enemyx < 1304){
					enemyy =  enemyy - 20;
				}
				if(enemyx == -84 || enemyx < -84){
					enemyy = enemyy + 60;
				}
				
				if(x == -84 ){
					x = x + 40;
				}   
				if(bossx == -84 || bossx < -84){
					bossx = 700;
				}
				if(bossx == 1449 || bossx > 1449){
					bossx = 600;
				}
				if(bossy == -96){
					bossy = 500;
					bossx = 800;
				}
				if(bossy == 764){
					bossy = bossy - 300;
				}
				if(y == -96)
				{
				y = y + 40;
				}
				if(healthbarwidth == 0){
					JOptionPane.showMessageDialog(null, "GREAT JOB YOU BEAT THE GAME.");
					System.exit(0);
				}
				//SCREEN 1
				
				if(screens == 1){
					if(y == -60  && x < 900 && x > 692){
					ImageIcon ib = new ImageIcon(this.getClass().getResource("screen2.png"));
					background = ib.getImage();	
					ImageIcon ie = new ImageIcon(this.getClass().getResource("dragonred.gif"));
					bully1 = ie.getImage();	
					arrow = null;
					x = 500;
					y = 500;
					swordgifx = 500;
					swordgify = 500;
					hitboxx = 503;
					hitboxy = 500;
					screens = 2;
					
					}
					 if(x > - 64 && x < 627 && y == -64){
						 y = y + 20;
						 swordgify = swordgify+ 20;
					 }
					 if(x > 900 && x < 1449 && y == -64){
						 y = y + 20;
						 swordgify = swordgify+ 20;
					 }
					  
					}
				//SCREEN 2
				//This is the second screen.
				if(screens == 2){
					enemyx = 300;
					enemyy = 500;
					if(y == 164 && x == 68 || y < 208 && y > -20  && x == 68){
						x = x + 20;
						swordgifx = swordgifx + 20;
					}
					if(y == -12 && x > 73 && x < 512 || y == -12 && x > 714 && x < 1292){
						y = y + 20;
					}
					
					enemyx += xVelocity;
					enemyy += yVelocity;
					double direction = Math.random()*2.0*Math.PI;
					double speed = 10.0;
					xVelocity = (int) (speed*Math.cos(direction));
					yVelocity = (int) (speed*Math.sin(direction));
					//calling the thirdscreen
					if(y > 209 && y < 292 && x == -24 ||x < -24){
						 ImageIcon ic = new ImageIcon(this.getClass().getResource("screen2left.png"));
						 background = ic.getImage();
						 ImageIcon ia = new ImageIcon(this.getClass().getResource("wyattandamir.png"));
						 wyattandamir = ia.getImage();
						 x = 1408;
						 y = 304;
						 swordgifx = 1408;
						 swordgify = 304;
						 screens = 3;
						 allowedtogoback = true;
					}
					//calling the fourth screen
					if(y < 295 && y > 220 && x == 1356){
						 ImageIcon ic = new ImageIcon(this.getClass().getResource("screen2right.png"));
						 background = ic.getImage();
						 ImageIcon ib = new ImageIcon(this.getClass().getResource("dragonred.gif"));
						 bully1 = ib.getImage();
						 ImageIcon ia = new ImageIcon(this.getClass().getResource("dragonred.gif"));
						 bully2 = ia.getImage();
						 x = 100;
						 y = 389;
						 screens = 4;
						 swordgifx = 100;
						 swordgify = 389;
					}
					//calling the fifth screen
					if(y == -56 && x > 550 && x < 680){
						 ImageIcon ic = new ImageIcon(this.getClass().getResource("dungeon1end.png"));
						 background = ic.getImage();
						 screens = 5;
						 enemyy = 2500;
						 enemyx = 2500;
						 bully1 = null;
						 y = 596;
					}
				}
				//SCREEN 3
				//this is the screen that is shown when you go through the left entrance in the second screen
				if(screens == 3){
					if(y < 349 && y > 258 && x == 1440){
						ImageIcon ic = new ImageIcon(this.getClass().getResource("screen2.png"));
						background = ic.getImage();
						wyattandamir = null;
						screens = 2;
						x = 500;
						y = 500;
						swordgifx = 500;
						swordgify = 500;
						hitboxx = 503;
						hitboxy = 500;
						
					}
					if(y == -28 && x < 1364 && x > 12){
							y = y + 20;
				     }
				}
				//SCREEN 4
				//This screen is when you go right in the second screen
				if(screens == 4){	
						enemyx = 500;
						enemyy = 500;
						enemy2x = 600;
						enemy2y = 500;
						enemyx += xVelocity;
						enemyy += yVelocity;
						enemy2x += x2Velocity;
						enemy2y += y2Velocity;
						double direction = Math.random()*2.0*Math.PI;
						double speed = 10.0;
						xVelocity = (int) (speed*Math.cos(direction));
						yVelocity = (int) (speed*Math.sin(direction));
						double direction2 = Math.random()*2.0*Math.PI;
						double speed2 = 10.0;
						x2Velocity = (int) (speed2*Math.cos(direction2));
						y2Velocity = (int) (speed2*Math.sin(direction2));
						
						
					if(y > 209 && y < 292 && x == -24 ||x < -24){
						 ImageIcon ic = new ImageIcon(this.getClass().getResource("screen2.png"));
						 background = ic.getImage();
						 screens = 2;
						 x = 500;
						 y = 200;
						 swordgifx = 500;
						 swordgify = 500;
						 bully2 = null;	
						 enemyx = 2000;
						 enemyy = 2000;
						 enemy2x = 2000;
						 enemy2y = 2000;
						 
					}  
					
				}
			
			//SCREEN 5	
				if(screens == 5){
					dungeon1end = true;
					if(y < 460 && y > 393 && x < 490 && x > 396){
						ImageIcon ic = new ImageIcon(this.getClass().getResource("screen3.png"));
						background = ic.getImage();
						   x = 700;
						square1x = 2500;
						square1y = 2500;
						screens = 6;
					}
					
				}
			//SCREEN 6
			   if(screens == 6){
				   if(y == -52 && x > 71 && x < 240){
					   x = 520;
					   y = 600;
						screens = 8;
					       ImageIcon ic = new ImageIcon(this.getClass().getResource("screen6(8).png"));
					       background = ic.getImage();
						   ImageIcon id = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						   bully1 = id.getImage();
						   ImageIcon ie = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						   bully2 = ie.getImage();
						   ImageIcon ia = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						   bully3 = ia.getImage();
						
				   }
				   if(y == -52 && x > 968 && x < 1116){
					   JOptionPane.showMessageDialog(null, "Challenge:Try to kill them all!");
					    ImageIcon ic = new ImageIcon(this.getClass().getResource("screen7(9).png"));
						background = ic.getImage();
						 ImageIcon ib = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						 bully1 = ib.getImage();
						 ImageIcon ia = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						 bully2 = ia.getImage();
						 ImageIcon id = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						 bully3 = id.getImage();
						 ImageIcon ie = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						 bully4 = ie.getImage();
						 ImageIcon ih = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						 bully5 = ih.getImage();
						 ImageIcon ig = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						 bully6 = ig.getImage();
						 ImageIcon ii = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						 bully7 = ii.getImage();
						 ImageIcon ik = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						 bully8 = ik.getImage();
						 ImageIcon il = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						 bully9 = il.getImage();
						 ImageIcon io = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						 bully10 = io.getImage();
						 y = 300;
						    enemyx = 500;
							enemyy = 500;
							enemy2x = 600;
							enemy2y = 500;
							enemy3x = 700;
							enemy3y = 500;
							enemy4x = 800;
							enemy4y = 500;
							enemy5x = 360;
							enemy5y = 580;
							enemy6x = 690;
							enemy6y = 400;
							enemy8x = 600;
							enemy8y = 300;
							enemy9x = 300;
							enemy9y = 600;
							enemy10x = 650;
							enemy10y = 500;
							monster1dead = false;
							monster2dead = false;
							monster4dead = false;
							monster5dead = false;
							monster6dead = false;
							monster7dead = false;
							monster8dead = false;
							monster9dead = false;
							monster10dead = false;
							screens = 7;
				   }
			   }
			   //SCREEN 7
			   if(screens == 7){
				   if(monster1dead == true){
					   enemyx = 2500;
					   enemyy = 2500;
				   }
				   if(monster2dead == true){
					   enemy2x = 2500;
					   enemy2y = 2500;
				   }
				   if(monster3dead == true){
					   enemy3x = 2500;
					   enemy3y = 2500;
				   }
				   if(monster4dead == true){
					   enemy4x = 2500;
					   enemy4y = 2500;
				   }
				   if(monster5dead == true){
					   enemy5x = 2500;
					   enemy5y = 2500;
				   }
				   if(monster6dead == true){
					   enemy6x = 2500;
					   enemy6y = 2500;
				   }
				   if(monster7dead == true){
					   enemy7x = 2500;
					   enemy7y = 2500;
				   }
				   if(monster8dead == true){ 
					   enemy8x = 2500;
					   enemy8y = 2500;
				   }
				   if(monster9dead == true){
					   enemy9x = 2500;
					   enemy9y = 2500;	
				   }
				  if(monster10dead == true){
					  enemy10x = 2500;
					  enemy10y = 2500;
				  }
				   if(monster1dead == false){
					   enemyx += xVelocity;
						enemyy += yVelocity;
						double direction = Math.random()*2.0*Math.PI;
						double speed = 10.0;
						xVelocity = (int) (speed*Math.cos(direction));
						yVelocity = (int) (speed*Math.sin(direction));	  
				   }
					   if(monster2dead == false){
						   enemy2x += x2Velocity;
							enemy2y += y2Velocity;
							double direction2 = Math.random()*2.0*Math.PI;
							double speed2 = 10.0;
							x2Velocity = (int) (speed2*Math.cos(direction2));
							y2Velocity = (int) (speed2*Math.sin(direction2));
					   }
					   if(monster3dead == false){
						enemy3x += x3Velocity;
						enemy3y += y3Velocity;
						double direction3 = Math.random()*2.0*Math.PI;
						double speed3 = 10.0;
						x3Velocity = (int) (speed3*Math.cos(direction3));
						y3Velocity = (int) (speed3*Math.sin(direction3));
					   }
					   if(monster4dead == false){
						enemy4x += x4Velocity;
						enemy4y += y4Velocity;
						double direction4 = Math.random()*2.0*Math.PI;
						double speed4 = 10.0;
						x4Velocity = (int) (speed4*Math.cos(direction4));
						y4Velocity = (int) (speed4*Math.sin(direction4));
					   }
					   if(monster5dead == false){
						enemy5x += x5Velocity;
						enemy5y += y5Velocity;
						double direction5 = Math.random()*2.0*Math.PI;
						double speed5 = 10.0;
						x5Velocity = (int) (speed5*Math.cos(direction5));
						y5Velocity = (int) (speed5*Math.sin(direction5));
					   }
					   if(monster6dead == false){
						enemy6x += x6Velocity;
						enemy6y += y6Velocity;
						double direction6 = Math.random()*2.0*Math.PI;
						double speed6 = 10.0;
						x6Velocity = (int) (speed6*Math.cos(direction6));
						y6Velocity = (int) (speed6*Math.sin(direction6));
					   }
					   if(monster7dead == false){
						    enemy7x += x7Velocity;
							enemy7y += y7Velocity;
							double direction7 = Math.random()*2.0*Math.PI;
							double speed7 = 10.0;
							x7Velocity = (int) (speed7*Math.cos(direction7));
							y7Velocity = (int) (speed7*Math.sin(direction7));

					   }
					   if(monster8dead == false){ 
							enemy8x += x8Velocity;
							enemy8y += y8Velocity;
							double direction8 = Math.random()*2.0*Math.PI;
							double speed8 = 10.0;
							x8Velocity = (int) (speed8*Math.cos(direction8));
							y8Velocity = (int) (speed8*Math.sin(direction8));
					   }
					   if(monster9dead == false){
							enemy9x += x9Velocity;
							enemy9y += y9Velocity;
							double direction9 = Math.random()*2.0*Math.PI;
							double speed9 = 10.0;
							x9Velocity = (int) (speed9*Math.cos(direction9));
							y9Velocity = (int) (speed9*Math.sin(direction9));
							
					   }
					  if(monster10dead == false){
							enemy10x += x10Velocity;
							double direction10 = Math.random()*2.0*Math.PI;
							double speed10 = 10.0;
							x10Velocity = (int) (speed10*Math.cos(direction10));
							y10Velocity = (int) (speed10*Math.sin(direction10));
					  }
					if(monsterskilled2 == 10){
						JOptionPane.showMessageDialog(null, "Wow...good job. I will commend you for that one");
						ImageIcon ic = new ImageIcon(this.getClass().getResource("screen3.png"));
						background = ic.getImage();
						screens = 6;
					}	
			   }
			   //SCREEN 8
			   if(screens == 8){
				   if(threerooms == 3){
					   
					   if(saythis == 1){
						   x = 300;
					   JOptionPane.showMessageDialog(null,"You have completed all three rooms. Now is the boss battle");
					   ImageIcon ic = new ImageIcon(this.getClass().getResource("dungeon2end.png"));
					   background = ic.getImage();
					   ImageIcon id = new ImageIcon(this.getClass().getResource("boss.gif"));
					   bossimage = id.getImage();
					   healthbar = true;
					   boss = true;
					   saythis = 0;
					   screens = 12;
					   }
				   }
				   enemyx = 400;
				   enemyy = 500;
				   enemy2x = 500;
				   enemy2y = 500;
				   enemyx += xVelocity;
				   enemyy += yVelocity;
				   enemy2x += x2Velocity;
				   enemy2y += y2Velocity;
				   enemy3x = 300;
				   enemy3y = 500;
				   enemy3x += x3Velocity;
				   enemy3y += y3Velocity; 
					double direction = Math.random()*2.0*Math.PI;
					double speed = 10.0;
					xVelocity = (int) (speed*Math.cos(direction));
					yVelocity = (int) (speed*Math.sin(direction));
					double direction2 = Math.random()*2.0*Math.PI;
					double speed2 = 10.0;
					x2Velocity = (int) (speed2*Math.cos(direction2));
					y2Velocity = (int) (speed2*Math.sin(direction2));
					double direction3 = Math.random()*2.0*Math.PI;
					double speed3 = 10.0;
					x3Velocity = (int) (speed3*Math.cos(direction3));
					y3Velocity = (int) (speed3*Math.sin(direction3));
				   if(y == -64 && x > 364 && x < 458){
					   ImageIcon ic = new ImageIcon(this.getClass().getResource("screen7(9).png"));
					   background = ic.getImage();
						 ImageIcon ib = new ImageIcon(this.getClass().getResource("dragonyellow.gif"));
						 bully1 = ib.getImage();
						 bigdragon = true;
						 ImageIcon ia = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						 bully2 = ia.getImage();
						 ImageIcon id = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						 bully3 = id.getImage();
					   enemyx = 600;
					   enemyy = 120;
					   enemy2y = 400;
					   enemy2x = 300;
					   enemy3x = 900;
					   enemy3y = 150;
					   y = 600;
					   screens = 9;
				   }
				   if(y == -64 && x > 630 && x < 692){
					   ImageIcon ic = new ImageIcon(this.getClass().getResource("screen7(9).png"));
					   background = ic.getImage();
						 ImageIcon ib = new ImageIcon(this.getClass().getResource("dragonyellow.gif"));
						 bully1 = ib.getImage();
						 bigdragon = true;
						 ImageIcon ia = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						 bully2 = ia.getImage();
						 ImageIcon id = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						 bully3 = id.getImage();
					   enemyx = 600;
					   enemyy = 120;
					   enemy2y = 400;
					   enemy2x = 300;
					   enemy3x = 900;
					   enemy3y = 150;
					   y = 600;
					   screens = 10;
				   }
				   if(y == -64 && x > 836 && x < 915){
					   ImageIcon ic = new ImageIcon(this.getClass().getResource("screen7(9).png"));
					   background = ic.getImage();
						 ImageIcon ib = new ImageIcon(this.getClass().getResource("dragonyellow.gif"));
						 bully1 = ib.getImage();
						 bigdragon = true;
						 ImageIcon ia = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						 bully2 = ia.getImage();
						 ImageIcon id = new ImageIcon(this.getClass().getResource("dragonblue.gif"));
						 bully3 = id.getImage();
					   enemyx = 600;
					   enemyy = 120;
					   enemy2y = 400;
					   enemy2x = 300;
					   enemy3x = 900;
					   enemy3y = 150;
					   y = 600;
					   screens = 11;
				   }
				   
			   }
			   if(screens == 9){
				    enemyx += xVelocity;
					enemyy += yVelocity;
					enemy2x += x2Velocity;
					enemy2y += y2Velocity;
					enemy3x += x3Velocity;
					enemy3y += y3Velocity; 
					double direction = Math.random()*2.0*Math.PI;
					double speed = 10.0;
					xVelocity = (int) (speed*Math.cos(direction));
					yVelocity = (int) (speed*Math.sin(direction));
					double direction2 = Math.random()*2.0*Math.PI;
					double speed2 = 10.0;
					x2Velocity = (int) (speed2*Math.cos(direction2));
					y2Velocity = (int) (speed2*Math.sin(direction2));
					double direction3 = Math.random()*2.0*Math.PI;
					double speed3 = 10.0;
					x3Velocity = (int) (speed3*Math.cos(direction3));
					y3Velocity = (int) (speed3*Math.sin(direction3));
					if(monsterskilled == 3){
						drawsquare2 = true;
						square2x = 500;
						square2y = 500;
						if(y < 472 && y > 392 && x < 485 && x > 394){
							threerooms = threerooms + 1;
							   ImageIcon ic = new ImageIcon(this.getClass().getResource("screen6(8).png"));
							   background = ic.getImage();
							   screens = 8;
							monsterskilled = 0;
							square2x = 2500;
							square2y = 2500;
						}
					}
			   }
			   if(screens == 10){
				    enemyx += xVelocity;
					enemyy += yVelocity;
					enemy2x += x2Velocity;
					enemy2y += y2Velocity;
					enemy3x += x3Velocity;
					enemy3y += y3Velocity;
					double direction = Math.random()*2.0*Math.PI;
					double speed = 10.0;
					xVelocity = (int) (speed*Math.cos(direction));
					yVelocity = (int) (speed*Math.sin(direction));
					double direction2 = Math.random()*2.0*Math.PI;
					double speed2 = 10.0;
					x2Velocity = (int) (speed2*Math.cos(direction2));
					y2Velocity = (int) (speed2*Math.sin(direction2));
					double direction3 = Math.random()*2.0*Math.PI;
					double speed3 = 10.0;
					x3Velocity = (int) (speed3*Math.cos(direction3));
					y3Velocity = (int) (speed3*Math.sin(direction3));
					if(monsterskilled == 3){
						drawsquare2 = true;
						square2x = 500;
						square2y = 500;
						if(y < 472 && y > 392 && x < 485 && x > 394){
							threerooms = threerooms + 1;
							   ImageIcon ic = new ImageIcon(this.getClass().getResource("screen6(8).png"));
							   background = ic.getImage();
							   screens = 8;
							monsterskilled = 0;
							square2x = 2500;
							square2y = 2500;
						}
					}
			   }
			   if(screens == 11){
				   enemyx += xVelocity;
				   enemyy += yVelocity;
				   enemy2x += x2Velocity;
				   enemy2y += y2Velocity;
				   enemy3x += x3Velocity;
				   enemy3y += y3Velocity; 
				   double direction = Math.random()*2.0*Math.PI;
					double speed = 10.0;
					xVelocity = (int) (speed*Math.cos(direction));
					yVelocity = (int) (speed*Math.sin(direction));
					double direction2 = Math.random()*2.0*Math.PI;
					double speed2 = 10.0;
					x2Velocity = (int) (speed2*Math.cos(direction2));
					y2Velocity = (int) (speed2*Math.sin(direction2));
					double direction3 = Math.random()*2.0*Math.PI;
					double speed3 = 10.0;
					x3Velocity = (int) (speed3*Math.cos(direction3));
					y3Velocity = (int) (speed3*Math.sin(direction3));
					if(monsterskilled == 3){
						drawsquare2 = true;
						square2x = 500;
						square2y = 500;
						if(y < 472 && y > 392 && x < 485 && x > 394){
							   threerooms = threerooms + 1;
							   ImageIcon ic = new ImageIcon(this.getClass().getResource("screen6(8).png"));
							   background = ic.getImage();
							   screens = 8;
							monsterskilled = 0;
							square2x = 2500;
							square2y = 2500;
							
						}
					}
			   }
			   if(screens == 12){
				   bossx += xVelocity;
					bossy += yVelocity;
					double direction = Math.random()*2.0*Math.PI;
					double speed = 12.0;
					xVelocity = (int) (speed*Math.cos(direction));
					yVelocity = (int) (speed*Math.sin(direction));
			   }
					}
		
			
		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			 ImageIcon ic = new ImageIcon(this.getClass().getResource("sword.gif"));
			 sword = ic.getImage();
			 swordgify = y;
			 swordgifx = x;
		}
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			setBackground(Color.BLACK);
			g.setColor(Color.RED);
			g.fillRect(500,500,30, 30);
			//background
			 Graphics2D g3g = (Graphics2D)g;
			 g3g.drawImage(background, 0, 0,this);
			 //wyatt and amir Image
			 Graphics2D g8g = (Graphics2D)g;
			 g8g.drawImage(wyattandamir, 500,500,this);
			//monster Image one
			 Graphics2D g7g = (Graphics2D)g;
			 g7g.drawImage(bully1, enemyx,enemyy,this);
			 //monster Image two
			 Graphics2D g9g = (Graphics2D)g;
			 g9g.drawImage(bully2, enemy2x,enemy2y,this);
			 //monster Image three
			 Graphics2D g10g = (Graphics2D)g;
			 g10g.drawImage(bully3, enemy3x,enemy3y,this);
			 Graphics2D g14g = (Graphics2D)g;
			 g14g.drawImage(bully4, enemy4x,enemy4y,this);
			 //monster Image two
			 Graphics2D g15g = (Graphics2D)g;
			 g15g.drawImage(bully5, enemy5x,enemy5y,this);
			 //monster Image three
			 Graphics2D g16g = (Graphics2D)g;
			 g16g.drawImage(bully6, enemy6x,enemy6y,this);
			 Graphics2D g17g = (Graphics2D)g;
			 g17g.drawImage(bully7, enemy7x,enemy7y,this);
			 //monster Image two
			 Graphics2D g18g = (Graphics2D)g;
			 g18g.drawImage(bully8, enemy8x,enemy8y,this);
			 //monster Image three
			 Graphics2D g19g = (Graphics2D)g;
			 g19g.drawImage(bully9, enemy9x,enemy9y,this);
			 Graphics2D g21g = (Graphics2D)g;
			 g21g.drawImage(bully10, enemy10x,enemy10y,this);
			 //arrow Image
			 Graphics2D g6g = (Graphics2D)g;
			 g6g.drawImage(arrow, 784, -23,this);
			 //main character Image
			 Graphics2D g4g = (Graphics2D)g;
			 g4g.drawImage(character, x, y,this);
			 //sword
			 Graphics2D g5g = (Graphics2D)g;
			 g3g.drawImage(sword, swordgifx, swordgify,this);
			 //"drawing" the heart
			 Graphics2D g11g = (Graphics2D)g;
			 g11g.drawImage(heart, 4, -50,this);
			 Graphics2D g12g = (Graphics2D)g;
			 g11g.drawImage(heart2, 80, -50,this);
			 Graphics2D g13g = (Graphics2D)g;
			 g11g.drawImage(heart3, 156, -50,this);
			 Graphics2D g20g = (Graphics2D)g;
			 g20g.drawImage(bossimage, bossx, bossy,this);
			 if(healthbar == true){
			 g.setColor(Color.RED);
			 g.fillRect(976, 25, healthbarwidth, healthbarheight);
			 }
			 if(gamestart == true){
				 if(sworddirection == 1){
				 g.drawRect(hitboxx, hitboxy, -60, 200);
				 }
			if(dungeon1end == true){
				g.setColor(Color.RED);
				g.fillRect(square1x, square1y, 40, 40);
			}
			if(drawsquare2 == true){
				g.setColor(Color.RED);
				g.fillRect(square2x, square2y, 40, 40);
			}
			if(drawsquare3 == true){
				g.setColor(Color.RED);
				g.fillRect(square3x, square3y, 40, 40);
			}
			if(drawsquare4 == true){
				g.setColor(Color.RED);
				g.fillRect(square4x, square4y, 40, 40);
			}
				
			 }
		}
	    
	}

