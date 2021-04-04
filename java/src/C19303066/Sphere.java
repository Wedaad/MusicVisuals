package C19303066;
import processing.core.*;

public class Sphere {
    
    WedaadsVisual wv;

    public Sphere(WedaadsVisual wv) {
        this.wv = wv;
    }

    float x;
    float y;

    public void render() { //drawing sphere to the screen
        

        wv.noStroke();    
        wv.lights();
        wv.translate(400, 400, 0);
        wv.sphere(50 + (100 * wv.lerpedAverage));
        float c = PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 0, 255);
        wv.fill(c, 255, 255);

    }

}
