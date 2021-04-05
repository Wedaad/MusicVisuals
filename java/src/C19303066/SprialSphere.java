package C19303066;
import processing.core.*;

public class SprialSphere {
    
    WedaadsVisual wv;

    public SprialSphere(WedaadsVisual wv) {
        this.wv = wv;
    }

    float angle = 0;

    public void render() { //drawing spiral sphere to the screen

        wv.pushMatrix();
        wv.translate(400, 400, -200);
        wv.rotateX(angle);
        wv.rotateY(angle);
        wv.noFill();
        wv.stroke(PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        wv.sphere(160 + (400 * wv.lerpedAverage));
        wv.popMatrix();
        angle += 0.03f;

    }
    

}
