package Pr6.Builder;

public class Numbers{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    private Numbers(Builder builder) {
        a = builder.a;
        b = builder.b;
        c = builder.c;
        d = builder.d;
    }
    public static class Builder{
        public int a;
        public int b;
        public int c = 0;
        public int d = 0;
        public Builder(int a, int b){
            this.a=a;
            this.b=b;
        }
        public Builder c (int val) {
            c = val;
            return this;
        }
        public Builder d (int val) {
            d = val;
            return this;
        }
        public Numbers buidl() {
            return new Numbers (this);
        }
    }
}
