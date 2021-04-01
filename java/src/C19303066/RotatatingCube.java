package C19303066;

import ie.tudublin.Visual;

public class RotatatingCube extends Visual {

    public void settings() {

        size(600, 600, P3D);

    }
    
    public void keyPressed() {

        if (key == ' ')
        {
            //playing the music when the space bar is hit
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
            
        }

    }

    public void setup() {

        colorMode(HSB);
        startMinim();
        loadAudio("TheBeach.mp3");
    }

    float angle = 0;

    public void draw() {

        background(0);
        calculateAverageAmplitude();
        stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        strokeWeight(8);
        noFill();
        lights();
        pushMatrix();
        camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        translate(0, 0, -200);
        rotateX(angle);
        rotateZ(angle);       
        float boxSize = 50 + (200 * getSmoothedAmplitude()); 
        box(boxSize);   
        popMatrix();
        angle += 0.01f;
    }  
        
}
