package C19303066;
import processing.core.*;


public class Flowers {

    WedaadsVisual wv;

    public Flowers(WedaadsVisual wv)
    {
        this.wv = wv;
    
    }

    float flowerSize = 20;
    float petalNo = 9;

    float angle = 0;
    float rotation;

    public void render() { // drawing the flower

        wv.colorMode(PApplet.HSB);
        wv.background(0);
        wv.calculateAverageAmplitude();
        wv.stroke(PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        wv.strokeWeight(flowerSize);
        wv.noFill();
        wv.translate(400, 400, 0);
        wv.rotateZ(PApplet.PI / 8);
        

        for(int i = 0; i < petalNo; i++) {

            wv.rotate(PApplet.TWO_PI / petalNo);
            wv.line(0, 0, 50 + wv.lerpedAverage * (10 * flowerSize), 0);


        }
    
        wv.stroke(0);
        wv.strokeWeight(8);
        wv.ellipse(0, 0, (float) 1.5 * flowerSize, (float) 1.5 * flowerSize);

    }

    

    
}
