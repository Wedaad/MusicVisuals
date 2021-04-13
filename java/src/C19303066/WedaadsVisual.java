package C19303066;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class WedaadsVisual extends Visual {

    float[] lerpedBuffer;
    Flowers flowers;
    Circle circle;
    Sphere sphere;
    SpiralSphere ssphere;
    SplitVisual sVisual;
    TwoCircles tCircles;

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
        colorMode(HSB);
        // Call loadAudio to load an audio file to process 
        //loadAudio("BadLiar.mp3");
        loadAudio("TheBeach.mp3");
        noCursor();
 
        // Call this instead to read audio from the microphone
        //startListening(); 
        
        flowers = new Flowers(this);
        circle = new Circle(this);
        sphere = new Sphere(this);
        ssphere = new SpiralSphere(this);
        sVisual = new SplitVisual(this);
        tCircles = new TwoCircles(this);
        
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
        for (int i = 0; i < getAudioBuffer().size(); i ++)
        {
            sum += abs(getAudioBuffer().get(i));
        }

        average = sum / getAudioBuffer().size();

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
                flowers.updatePosition();
                break;
            }//ends case 0

            case 1: {

                flowers.render();
                flowers.updatePosition();
                circle.render();
                break;
            }//ends case 1 

            case 2: {

                tCircles.render();
                sphere.render();
                break;

            }//ends case 2

            case 3: { 
                
                tCircles.render();
                ssphere.render();
                break;
            }

            case 4: {

                sphere.render();
                break;
            }
            
            case 5: {

                sVisual.render();
                break;
            }

        }//ends switch
        
        
        

    }
    
}
