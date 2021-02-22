package Pr7.Bridge;

public class Pencil extends SubjectForDrawing{

    public Pencil(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("draw with a "+color.getColor()+" pencil");
    }
}
