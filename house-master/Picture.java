/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle campo;
    private Person per;
    
    
    
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        
        campo = new Circle();
        campo.changeColor("green");
        campo.moveHorizontal(-650);
        campo.moveVertical(150);
        campo.changeSize(1400);
        campo.makeVisible();
        
        
        
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    
    /**
     * Se mueve el sol hacia abajo lentamente.
     */
    public void moveSun()
    {
        if (wall != null)   // only if it's painted already...
        {
        
            sun.slowMoveVertical(120);
            roof.changeColor("black");
            wall.changeColor("black");
            window.changeColor("white");
            campo.changeColor("black");
            
        }
    }
    
    /**
     * Se mueve el sol hacia abajo lentamente.
     */
    public void apaPernon()
    {
        if (wall != null)   // only if it's painted already...
        {
        
        
        per = new Person();
        per.changeColor("black");
        per.changeSize(80, 30);
        per.moveHorizontal(-200);
        per.makeVisible();
        per.slowMoveHorizontal(100);
        
        
            
        }
    }
   
    }
