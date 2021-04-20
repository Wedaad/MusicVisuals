package C19303066;

import processing.core.*;

public class TwoCircles {
    
    WedaadsVisual wv;

    public TwoCircles(WedaadsVisual wv) {
        this.wv = wv;
    }

    float angle = 0;

    public void render() { // drawing the circle
    

        float c = PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 30, 255);
        wv.stroke(c, 255, 255);        
        wv.strokeWeight(5);
        wv.noFill();
        wv.ellipse(wv.width / 2, wv.height / 2, 600 + (wv.lerpedAverage * 300), 600 + (wv.lerpedAverage * 300)); 
        wv.ellipse(wv.width / 2, wv.height / 2, 400 + (wv.lerpedAverage * 300), 400 + (wv.lerpedAverage * 300)); 
 
    }//ends render
}