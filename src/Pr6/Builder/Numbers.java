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
    //Реализация Builder через статический внутренний класс
    public static class Builder{
        //Обязательные параметры
        public int a;
        public int b;
        //Необязательные параметры со значениями по умолчанию
        public int c = 0;
        public int d = 0;
        //Конструктор с обязательными параметрами
        public Builder(int a, int b){
            this.a=a;
            this.b=b;
        }
        //Методы с возвращающим типом Builder для необязательного параметра с, d, e, f,
        public Builder c (int val) {
            c = val;
            return this;
        }
        public Builder d (int val) {
            d = val;
            return this;
        }
        //Метод с возвращающим типом Good для генерации объекта
        public Numbers buidl() {
            return new Numbers (this);
        }

    }
}
