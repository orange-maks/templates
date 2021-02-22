package Pr7.Bridge;

public class Pen extends SubjectForDrawing {
    public Pen(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("draw with a "+color.getColor()+" pen");
    }
}
