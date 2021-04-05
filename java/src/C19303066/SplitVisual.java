package C19303066;

import processing.core.*;

public class SplitVisual {
    
    WedaadsVisual wv;

    public SplitVisual(WedaadsVisual wv) {
        this.wv = wv;
    }
    float angle = 0;

    public void render() {

        float c = PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 0, 255);
        wv.stroke(c, 255, 255);        
        wv.strokeWeight(1);
        wv.noFill();

        wv.pushMatrix();
        wv.translate(170, 405, -100);
        wv.rotateX(angle);
        wv.rotateY(angle);
        wv.noFill();
        wv.stroke(PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        wv.sphere(25 + (200 * wv.lerpedAverage));
        wv.popMatrix();
        angle += 0.03f;

        wv.ellipse((wv.width / 2) - 200, wv.height / 2, 250 + (wv.lerpedAverage * 300), 250 + (wv.lerpedAverage * 300)); 
        wv.ellipse((wv.width / 2) - 200, wv.height / 2, 150 + (wv.lerpedAverage * 300), 150 + (wv.lerpedAverage * 300)); 


        wv.ellipse((wv.width / 2) + 200, wv.height / 2, 250 + (wv.lerpedAverage * 300), 250 + (wv.lerpedAverage * 300)); 
        wv.ellipse((wv.width / 2) + 200, wv.height / 2, 150 + (wv.lerpedAverage * 300), 150 + (wv.lerpedAverage * 300)); 

        // wv.pushMatrix();
        // wv.translate(170, 405, -100);
        // wv.rotateX(angle);
        // wv.rotateY(angle);
        // wv.noFill();
        // wv.stroke(PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        // wv.sphere(25 + (200 * wv.lerpedAverage));
        // wv.popMatrix();
        // angle += 0.03f;

    }
    
}
