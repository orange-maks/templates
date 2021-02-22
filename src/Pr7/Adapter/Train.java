package Pr7.Adapter;

public class Train {
    private GoAsTrain go;

    public Train() {
    }

    public Train(GoAsTrain go){
        this.go=go;
    }

    public void GoOnRailway(){
        System.out.println("We started");
        go.start();
        System.out.println("Finish");
    }
}
