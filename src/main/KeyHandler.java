package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean upPressed, downPressed, leftPressed, rightPressed;
    public boolean moving;
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W){
            upPressed = true;
            moving = true;
        }
        if(code == KeyEvent.VK_S){
            downPressed = true;
            moving = true;
        }
        if(code == KeyEvent.VK_A){
            leftPressed = true;
            moving = true;
        }
        if(code == KeyEvent.VK_D){
            rightPressed = true;
            moving = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W){
            upPressed = false;
            moving = false;
        }
        if(code == KeyEvent.VK_S){
            downPressed = false;
            moving = false;
        }
        if(code == KeyEvent.VK_A){
            leftPressed = false;
            moving = false;
        }
        if(code == KeyEvent.VK_D){
            rightPressed = false;
            moving = false;
        }
    }
}
