package ie.tudublin;

import example.CubeVisual;
import example.RotatingAudioBands;
import example.MyVisual;
import C19303066.WedaadsVisual;
import example.RotatingAudioBands;

public class Main
{	

	// public void startUI()
	// {
	// 	String[] a = {"MAIN"};
    //     processing.core.PApplet.runSketch( a, new MyVisual());		
	// }

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new WedaadsVisual());		
	}

	
	// public void startUI()
	// {
	// 	String[] a = {"MAIN"};
    //     processing.core.PApplet.runSketch( a, new RotatingAudioBands());		
	// }

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}