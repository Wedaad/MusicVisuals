package C19303066;
import processing.core.*;

public class Sphere {
    
    WedaadsVisual wv;

    public Sphere(WedaadsVisual wv) {
        this.wv = wv;
    }

    //float angle = 0;

    public void render() { //drawing sphere to the screen
        

        // wv.noStroke();    
        // wv.lights();
        // wv.translate(400, 400, 0);
        // wv.sphere(150 + (100 * wv.lerpedAverage));
        // float c = PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 0, 255);
        // wv.fill(c, 255, 255);
        
        // wv.noStroke();    
        // wv.lights();
        // wv.translate(400, 400, -250);
        // wv.sphere(200 + (500 * wv.lerpedAverage));
        // float c = PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 0, 255);
        // wv.fill(c, 255, 255);

        wv.lights();
        wv.translate(400, 400, -200);
        wv.stroke(PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        //wv.noStroke();
        float c = PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 0, 255);
        wv.fill(c, 255, 255);
        wv.sphere(160 + (400 * wv.lerpedAverage));
    }

}
