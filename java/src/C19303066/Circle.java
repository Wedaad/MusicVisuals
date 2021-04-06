package C19303066;
import processing.core.*;

public class Circle {
    
    WedaadsVisual wv;

    public Circle(WedaadsVisual wv) {
        this.wv = wv;
    }

    float angle = 0;

    public void render() { // drawing the circle
    

        float c = PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 0, 255);
        wv.stroke(c, 255, 255);        
        wv.strokeWeight(2);
        wv.noFill();
        wv.ellipse(wv.width / 2, wv.height / 2, 600 + (wv.lerpedAverage * 300), 600 + (wv.lerpedAverage * 300)); 
        wv.ellipse(wv.width / 2, wv.height / 2, 400 + (wv.lerpedAverage * 300), 400 + (wv.lerpedAverage * 300)); 

        //outer circle spinning atm
        // wv.pushMatrix();
        // wv.translate(wv.width / 2, wv.height / 2, -500);
        // wv.rotateZ(angle);
        // wv.ellipse(wv.width / 2, wv.height / 2, 100 + (wv.lerpedAverage * 100), 100 + (wv.lerpedAverage * 100)); 
        // wv.popMatrix();
        // angle += 0.01f;
 
    }//ends render
    

}
