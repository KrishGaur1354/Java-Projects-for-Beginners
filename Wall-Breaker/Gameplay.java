package brickBracker;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
    private boolean play = false;
    private int score = 0;
    private int totalBricks = 21;
    private Timer time;
    private int delay = 8;
    private int playerX = 310;
    private int ballposX = 120;
    private int ballposY = 350;
    private int ballXdir = -1;
    private int ballYdir = -2;
    private MapGenerator map;

    public Gameplay() {
        map = new MapGenerator(3,7);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        time = new Timer(delay, this);
        time.start();
    }

    public void paint(Graphics g){
        //Background
        g.setColor(Color.BLACK);
        g.fillRect(1,1,692,592);

        //drawing
        map.draw((Graphics2D)g);

        //Borders
        g.setColor(Color.WHITE);
        g.fillRect(0,0,3,592);
        g.fillRect(0,0,692,3);
        g.fillRect(691,0,3,592);

        //Scores
        g.setColor(Color.WHITE);
        g.setFont(new Font("ariel", Font.BOLD,25));
        g.drawString("Your Score: ", 420,30);
        g.drawString(""+score,590,30);


        //Paddle
        g.setColor(Color.GREEN);
        g.fillRect(playerX,550,100,8);

        //Ball
        g.setColor(Color.RED);
        g.fillOval(ballposX,ballposY,20,20);

        if(totalBricks <= 0) {
            play = false;
            ballXdir=0;
            ballYdir=0;
            g.setColor(Color.GREEN);
            g.setFont(new Font("ariel",Font.BOLD,30));
            g.drawString("You Won: " , 260, 300);
            g.setColor(Color.WHITE);
            g.drawString(""+score,500,300);

            g.setFont(new Font("ariel",Font.BOLD,20));
            g.drawString("Press Enter to Restart" , 230, 350);
        }

        if(ballposY > 570){
            play = false;
            ballXdir=0;
            ballYdir=0;
            g.setColor(Color.RED);
            g.setFont(new Font("ariel",Font.BOLD,30));
            g.drawString("Game Over!, Scores: " , 190, 300);
            g.setColor(Color.WHITE);
            g.drawString(""+score,500,300);

            g.setFont(new Font("ariel",Font.BOLD,20));
            g.drawString("Press Enter to Restart" , 230, 350);
        }

        g.dispose();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        time.start();
        if(play) {
            if(new Rectangle(ballposX,ballposY,20,20).intersects(new Rectangle(playerX,550,100,8))){
                ballYdir = -ballYdir;
            }
            A: for(int i =0; i < map.map.length; i++){
                for(int j = 0; j < map.map[0].length ; j++) {
                    if(map.map[i][j] > 0) {
                        int brickX = j * map.BrickWidth + 80;
                        int brickY = i * map.BrickHeight + 50;
                        int BrickWidth = map.BrickWidth;
                        int BrickHeight = map.BrickHeight;

                        Rectangle rect = new Rectangle(brickX, brickY, BrickWidth,BrickHeight);
                        Rectangle ballRect = new Rectangle(ballposX, ballposY, 20,20);
                        Rectangle brickRect = rect;

                        if(ballRect.intersects(brickRect)){
                            map.setBrickValue(0,i,j);
                            totalBricks--;
                            score += 5;

                            if(ballposX + 19 <= brickRect.x || ballposX + 1 >= brickRect.x + brickRect.width) {
                                ballXdir = -ballXdir;
                            }else {
                                ballYdir = -ballYdir;
                            }
                        }
                    }
                }
            }
            ballposX += ballXdir;
            ballposY += ballYdir;
            if(ballposX < 0){
                ballXdir = -ballXdir;
            }
            if(ballposY < 0){
                ballYdir = -ballYdir;
            }
            if(ballposX > 670){
                ballXdir = -ballXdir;
            }
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            if(playerX >= 600) {
                playerX = 600;
            }else{
                moveRight();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            if(playerX < 10) {
                playerX = 10;
            }else{
                moveLeft();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            if(!play) {
                play = true;
                ballposX = 120;
                ballposY = 350;
                ballXdir = -1;
                ballYdir = -2;
                playerX = 310;
                score = 0;
                totalBricks = 21;
                map = new MapGenerator(3,7);
            }
        }
    }
    public void moveRight() {
        play = true;
        playerX+=20;
    }
    public void moveLeft() {
        play = true;
        playerX-=20;
    }
    @Override
    public void keyReleased(KeyEvent e) {}
}
