import processing.core.PApplet;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App extends PApplet {
    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        background(0, 0);
    }

    public void draw() {
        fill(255);
        rect(100, 100, 100, 100);
    }
}