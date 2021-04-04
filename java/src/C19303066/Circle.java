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
        wv.ellipse(wv.width / 2, wv.height / 2, 350 + (wv.lerpedAverage * 100), 350 + (wv.lerpedAverage * 100)); 
        wv.ellipse(wv.width / 2, wv.height / 2, 200 + (wv.lerpedAverage * 100), 200 + (wv.lerpedAverage * 100)); 

        //outer circle spinning atm
        wv.pushMatrix();
        wv.translate(wv.width / 2, wv.height / 2, -1000);
        wv.rotateZ(angle);
        wv.ellipse(wv.width / 2, wv.height / 2, 200 + (wv.lerpedAverage * 100), 200 + (wv.lerpedAverage * 100)); 
        wv.popMatrix();
        angle += 0.01f;

        //outer second circle spinning atm
        // wv.pushMatrix();
        // wv.translate(wv.width, wv.height, -950);
        // wv.rotateZ(angle);
        // wv.ellipse(wv.width / 2, wv.height / 2, 200 + (wv.lerpedAverage * 100), 200 + (wv.lerpedAverage * 100)); 
        // wv.popMatrix();
        // angle += 0.01f;
 
    }//ends render
    

}
