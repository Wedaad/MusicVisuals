package C19303066;

import processing.core.*;

public class SpiralSphere {
    
    WedaadsVisual wv;

    public SpiralSphere(WedaadsVisual wv) {
        this.wv = wv;
    }

    float angle = 0;

    public void render() { //drawing spiral sphere to the screen

        wv.pushMatrix();
        wv.translate(400, 400, -200);
        wv.rotateX(angle);
        wv.rotateY(angle);
        wv.noFill();
        wv.stroke(PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 100, 255), 255, 255);
        wv.strokeWeight(1);
        wv.sphere(160 + (1000 * wv.lerpedAverage));
        wv.popMatrix();
        angle += 0.03f;

    }
    

}
