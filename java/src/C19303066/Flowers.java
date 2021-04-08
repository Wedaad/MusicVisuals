package C19303066;
import processing.core.*;


public class Flowers {

    WedaadsVisual wv;

    public Flowers(WedaadsVisual wv)
    {
        this.wv = wv;
        moveFlower();
    
    }

    float flowerSize = 20;
    float petalNo = 9;

    float angle = 0;
    float rotation;

    //trying to move the flower around
    float x = 0;
    float y = 0;
    float dx = 0;
    float dy = 5;
    float w = 50;
    float halfW = w / 2;

    public void moveFlower() {

        //rotating and increasing the size of the flower
        x = wv.random(0, 1);
        y = - halfW;
        dx = wv.random(-1, 1);
        dy = wv.random(1, 1);

    }

    public void render() { // drawing the flower

        wv.pushMatrix();
        wv.background(0);
        wv.calculateAverageAmplitude();
        wv.stroke(PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        wv.strokeWeight(flowerSize);
        wv.noFill();
        wv.translate(400, 400, 0);
        wv.rotateZ(PApplet.PI / 8);
        

        for(int i = 0; i < petalNo; i++) {

            wv.rotate(PApplet.TWO_PI / petalNo);
            wv.line(0, 0, y, 25 + wv.lerpedAverage * (10 * flowerSize));


        }
    
        wv.stroke(0);
        wv.strokeWeight(8);
        wv.ellipse(0, 0, (float) 1.5 * flowerSize, (float) 1.5 * flowerSize);
        wv.popMatrix();

    }

    void updatePosition() {

        x += dy;
        y += dx;
        rotation += 0.05f;

        if( x > wv.width / 4 || y > wv.height / 4) {

            moveFlower();

        }
     
    }

    
}
