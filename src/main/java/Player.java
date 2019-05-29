import processing.core.PApplet;

public class Player {

    private PApplet p;

    public Player(PApplet p) {
        this.p = p;
    }


    public void show() {
        p.ellipse(100, 100, 50, 50);
    }
}
