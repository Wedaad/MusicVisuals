package C19303066;

import ie.tudublin.Visual;

public class Flowers extends Visual {

    // float x = 20;
    // float y = 50;
    float flowerSize = 20;
    float petalNo = 9;

    public void settings() {

        size(800, 800, P3D);

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
    float rotation;

    public void drawFlower() { // drawing the flower
        
        background(0);
        calculateAverageAmplitude();
        stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        strokeWeight(flowerSize);
        noFill();
        translate(400, 400, 0);  

        for(int i = 0; i < petalNo; i++) {

            rotate(TWO_PI / petalNo);
            line(0, 0, 3 * flowerSize, 0);

        }

        stroke(0);
        strokeWeight(8);
        ellipse(0, 0, (float) 1.5 * flowerSize, (float) 1.5 * flowerSize);

        pushMatrix();
        translate(0, 0, -200);
        noFill();  
        rotateX(angle);
        rotateZ(angle);
        popMatrix();
        angle += 0.01f;

    }

    

    public void draw() { 

        drawFlower();
    
    }  
    
}
