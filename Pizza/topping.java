import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class topping here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class topping extends Actor
{
    /**
     * Act - do whatever the topping wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    
    }
    private String name;
        public topping(String name){
            this.name=name;
            setImage(name+".png");
        }
        
}

