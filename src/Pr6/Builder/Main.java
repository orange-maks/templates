package Pr6.Builder;

public class Main {
    public static void main(String[] args) {
        Numbers numbers =new Numbers.Builder(1,2).c(3).buidl();
        System.out.println(numbers.a+" "+numbers.b+" "+numbers.c+" "+numbers.d);
    }
}
