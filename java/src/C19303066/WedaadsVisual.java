package C19303066;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class WedaadsVisual extends Visual {

    float[] lerpedBuffer;
    Flowers flowers;
    Circle circle;
    Sphere sphere;
    SprialSphere ssphere;
    SplitVisual sVisual;

    public void settings()
    {
        size(800, 800, P3D);
        
        // Use this to make fullscreen
        //fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        //fullScreen(P3D, SPAN); 
    }

    float y = 200;
    float halfHeight = height / 2;
    float lerpedY = y;

    public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("BadLiar.mp3");
 

        // Call this instead to read audio from the microphone
        //startListening(); 
        
        flowers = new Flowers(this);
        circle = new Circle(this);
        sphere = new Sphere(this);
        ssphere = new SprialSphere(this);
        sVisual = new SplitVisual(this);
        lerpedBuffer = new float[width];

    
    }

    int visualNo = 0;

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0); //same as rewind - goes back to start 
            getAudioPlayer().play();
        }
        if (keyCode >= '0' && keyCode <= '5' )
        {
            visualNo = keyCode - '0';
        }
    }

    float lerpedAverage = 0;
    public float average;

    public void draw()
    {
        float sum = 0;
        float average = 0;

        //calculating the average of the buffer
        for (int i = 0; i < ab.size(); i ++)
        {
            sum += abs(ab.get(i));
        }

        average = sum / ab.size();

        lerpedAverage = lerp(lerpedAverage, average, 0.1f);

        background(0);
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();        
        
        switch (visualNo) { //REMOVE BREAK OR REMOVE SWITCH ALL TOGETHER - IF KEY BLAH BLAH

            case 0: { //flowers

                flowers.render();
                break;
            }//ends case 0

            case 1: {


                // flowers.render();
                circle.render();
                break;
            }//ends case 1 

            case 2: {

                sphere.render();
                break;

            }//ends case 2

            case 3: { // doesnt work
                
                circle.render();
                sphere.render();
                break;
            }

            case 4: {

                circle.render();
                ssphere.render();
                break;
            }
            
            case 5: {

                sVisual.render();
                break;
            }

        }//ends switch
        
        
        

    }
    
}
