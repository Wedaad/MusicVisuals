package C19303066;

import processing.core.*;

public class Sphere {
    
    WedaadsVisual wv;

    public Sphere(WedaadsVisual wv) {
        this.wv = wv;
    }

    public void render() { //drawing sphere to the screen
    

        wv.lights();
        wv.translate(400, 400, -200);
        wv.stroke(PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 220, 255), 255, 255);
        wv.strokeWeight(1);
        float c = PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 220, 255);
        wv.fill(c, 255, 255);
        wv.sphere(160 + (350 * wv.lerpedAverage));
    }

}

