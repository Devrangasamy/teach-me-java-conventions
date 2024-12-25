package OOPS;
import processing.core.PApplet;

public class FourBallsOOP extends PApplet {
    Ball[] balls = new Ball[4];

    public static void main(String[] args) {
        PApplet.main("OOPS.FourBallsOOP");
    }

    public void settings() {
        size(800, 600);
    }

    public void setup() {
        background(0);


        balls[0] = new Ball(1, height / 5, color(255, 0, 0));
        balls[1] = new Ball(2, 2 * height / 5, color(0, 255, 0));
        balls[2] = new Ball(3, 3 * height / 5, color(0, 0, 255));
        balls[3] = new Ball(4, 4 * height / 5, color(255, 255, 0));
    }

    public void draw() {
        for (Ball ball : balls) {
            ball.move();
            ball.display();
            ball.logPosition();
        }
    }

    class Ball {
        int speed;
        float y;
        float x;
        int color;

        Ball(int speed, float y, int color) {
            this.speed = speed;
            this.y = y;
            this.x = 0;
            this.color = color;
        }

        void move() {
            x += speed;
        }

        void display() {
            fill(color);
            ellipse(x, y, 20, 20);
        }

        void logPosition() {
            println("Ball at height " + y + ": X = " + x);
        }
    }
}
