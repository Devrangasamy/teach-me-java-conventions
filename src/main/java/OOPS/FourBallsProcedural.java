package OOPS;
import processing.core.PApplet;

public class FourBallsProcedural extends PApplet {
    int ball1 = 0;
    int ball2 = 0;
    int ball3 = 0;
    int ball4 = 0;

    public static void main(String[] args) {
        PApplet.main("OOPS.FourBallsProcedural");
    }

    public void settings() {
        size(800, 600);
    }

    public void setup() {
        background(0);
    }

    public void draw() {
        fill(255, 0, 0);
        ellipse(ball1, height/5, 20, 20);
        ball1 += 1;

        fill(0, 255, 0);
        ellipse(ball2, 2*height/5, 20, 20);
        ball2 += 2;


        fill(0, 0, 255);
        ellipse(ball3, 3*height/5, 20, 20);
        ball3 += 3;


        fill(255, 255, 0);
        ellipse(ball4, 4*height/5, 20, 20);
        ball4 += 4;
    }
}
