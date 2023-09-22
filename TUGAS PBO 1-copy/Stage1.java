import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage1 extends PlatformStage
{
    int gravity = 1;
    
    public int setGravity(int gravity){
        return this.gravity;
    }
    
    public Stage1()
    {
        Player snake = new Player();
        this.addObject(snake, 300, 200);
        this.gravity = 1;
        Player sanke2 = new Player();
        this.addObject(snake, 500, 0);
        this.gravity = 1;
        Player sanke3 = new Player();
        this.addObject(snake, 500, 0);
    }
    
    public void act(){
        List<Characters> allChars = this.getObjects(Characters.class);
        for(Characters chara : allChars){
            int xPoss = chara.getX();
            int yPoss = chara.getY();
            chara.setLocation(xPoss, yPoss+this.gravity);
        }
    }
}
