package C19303066;
import processing.core.*;


public class Flowers {

    WedaadsVisual wv;

    public Flowers(WedaadsVisual wv)
    {
        this.wv = wv;
        //moveFlower();
    
    }

    float flowerSize = 20;
    float petalNo = 9;

    float angle = 0;
    float rotation;

    //trying to move the flower around
    // float x, y;
    // float dx, dy;
    // float w = 50;
    // float halfW = w /2;

    // public void moveFlower() {

    //     int randomNo = (int) wv.random(4); //generating random numbers from 0 to 4

    //     System.out.println("RandomNo: " + randomNo);
    //     switch (randomNo) {

    //         case 0: { //flower comes in from the bottom of the screen

    //             x = wv.random(halfW, wv.height - halfW);
    //             y = wv.height + halfW;
    //             dx = wv.random(1, 4);
    //             dy = wv.random(-1, 1);
    //             break;
    
    //         }
    //         case 1: { //flower comes in from the top of the screen
    
    //             x = wv.random(halfW, wv.width - halfW);
    //             y = - halfW;;
    //             dx = wv.random(-1, 1);
    //             dy = wv.random(1, 4);
    //             break;
    
    //         }
    //         case 2: { //flower comes in from the right of the screen
    
    //             x = wv.width + halfW;
    //             y =  wv.random(halfW, wv.height - halfW);
    //             dx =  wv.random(1, 4);
    //             dy =  wv.random(-1, 1);
    //             break;
    //         }
    //         case 3: { //flower comes in from the left of the screen
    
    //             x = - halfW;
    //             y = wv.random(halfW, wv.height - halfW);
    //             dx = wv.random(1, 4);
    //             dy = wv.random(-1, 1);
    //             break;
    //         }






    //     }
        // if (randomNo == 0) { //flower comes in from the bottom of the screen

        //     x = wv.random(halfW, wv.height - halfW);
        //     y = wv.height + halfW;
        //     dx = wv.random(1, 4);
        //     dy = wv.random(-1, 1);


        // }
        // else if (randomNo == 1) { //flower comes in from the top of the screen

        //     x = wv.random(halfW, wv.width - halfW);
        //     y = - halfW;;
        //     dx = wv.random(-1, 1);
        //     dy = wv.random(1, 4);


        // }
        // else if (randomNo == 2) { //flower comes in from the right of the screen

        //     x = wv.width + halfW;
        //     y =  wv.random(halfW, wv.height - halfW);
        //     dx =  wv.random(1, 4);
        //     dy =  wv.random(-1, 1);

        // }
        // else { //flower comes in from the left of the screen

        //     x = - halfW;
        //     y = wv.random(halfW, wv.height - halfW);
        //     dx = wv.random(1, 4);
        //     dy = wv.random(-1, 1);

        // }

    //}

    public void render() { // drawing the flower

        wv.pushMatrix();
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
        wv.popMatrix();

        // wv.pushMatrix();
        // wv.translate(400, 400, -200);
        // wv.rotateX(angle);
        // wv.rotateY(angle);
        // wv.noFill();
        // wv.stroke(PApplet.map(wv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        // wv.sphere(160 + (400 * wv.lerpedAverage));
        // wv.popMatrix();
        // angle += 0.03f;

    }

    // void updatePosition() {

    //     x += dx;
    //     y += dy;
    //     rotation += 0.05f;

    //     if(x < - halfW || x > wv.width + halfW || y < -halfW || y > wv.height + halfW) {

    //         moveFlower();

    //     }
     

    // }

    

    
}
