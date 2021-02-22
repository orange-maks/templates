package Pr7.Bridge;

public class Main {
    public static void main(String[] args) {
        SubjectForDrawing pen = new Pen(new RedColor());
        SubjectForDrawing pencil = new Pencil(new BlueColor());
        pen.draw();
        pencil.draw();
    }
}
