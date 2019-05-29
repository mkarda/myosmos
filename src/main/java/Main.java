import processing.core.PApplet;

public class Main extends PApplet {

    private PApplet pApplet;
    private Player player;

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void setup() {
        player = new Player(pApplet);

    }

    public void draw() {
        player.show();
    }





    public void settings() {
        size(1000, 1000);
        pApplet = this;
    }
}
