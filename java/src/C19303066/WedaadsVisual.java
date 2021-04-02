package C19303066;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class WedaadsVisual extends Visual {

    float[] lerpedBuffer;
    Flowers flowers;

    public void settings()
    {
        size(800, 800, P3D);
        
        // Use this to make fullscreen
        //fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        //fullScreen(P3D, SPAN); 
    }

    float y = 200;
    float lerpedY = y;

    public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("TheBeach.mp3");
 

        // Call this instead to read audio from the microphone
        //startListening(); 
        
        flowers = new Flowers(this);
        lerpedBuffer = new float[width];

    
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
    }

    float lerpedAverage = 0;

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
        flowers.render();

    }
    
}
