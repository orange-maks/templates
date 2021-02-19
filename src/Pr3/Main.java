package Pr3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    static MyListLite myList=new MyListLite();
    static MyMap<Integer,Integer> myMap=new MyMap<Integer,Integer>();
    static class Th1 extends Thread{
        @Override
        public void run() {

            myList.add(79);
            myList.add(963);
            myList.add(100);
            myList.add(123);
            myList.add(456);
            myList.add(159);
            myList.set(2,99999);
            myList.add(2,777);
        }
    }
    static class Th2 extends Thread{
        @Override
        public void run() {
            myMap.put(123,456);
            myMap.put(123,45609);
            myMap.put(789,147);
            System.out.println(myMap.containsKey(123));
            System.out.println(myMap.containsValue(456));
            System.out.println(myMap.get(1));

        }
    }
    public static void main(String[] args) throws InterruptedException {
        Th1 t11=new Th1();
        Th1 t12=new Th1();
        t11.start();
        t12.start();
        Thread.sleep(6000);
        for(int i=0;i<myList.size();++i){
                System.out.println(Thread.currentThread().getName()+"\t\t"+myList.get(i));
        }
        Th2 t21=new Th2();
        Th2 t22=new Th2();
        t21.start();
        t22.start();
//        Map<Integer,Integer> ap=new HashMap<>();
//        ap.put(79,46);
//        ap.put(1000,333);
//        MyMap<Integer,Integer> myMap=new MyMap<>();
//        myMap.put(1233,456);
//        myMap.put(999,777);
//        System.out.println(myMap.containsKey(999)+"\t"+myMap.containsValue(456));
//        System.out.println(myMap.get(999));
//        myMap.putAll(ap);
//        int[] a={9,6,4,3,856,65};
//        int[] b=new int[a.length];
//
//        b[0]=0;
//        System.out.println(a[0]);

    }
}
