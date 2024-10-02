package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
StdDraw.setCanvasSize(800, 600);
        
        // Set the scale
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);

      
        StdDraw.setPenColor(Color.BLUE);
        StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5); 
        
        StdDraw.setPenColor(Color.YELLOW);
        StdDraw.filledRectangle(0.5, 0.5, 0.1,0.5); 
        

        StdDraw.setPenColor(Color.WHITE);
        StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.1); 
        
        StdDraw.setPenColor(Color.WHITE);
        StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.1); 
        
        StdDraw.setPenColor(Color.GREEN);
        StdDraw.filledCircle(0.1, 0.1, 0.05); 

        StdDraw.setPenColor(Color.GREEN);
        StdDraw.filledCircle(0.9, 0.9, 0.05); 
        
        StdDraw.setPenColor(Color.PINK);
        StdDraw.filledCircle(0.1, 0.9, 0.05); 
        
        StdDraw.setPenColor(Color.PINK);
        StdDraw.filledCircle(0.9, 0.1, 0.05); 
        
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.filledCircle(0.5, 0.5, 0.1); 
        
        StdDraw.setPenRadius();	
	}
}