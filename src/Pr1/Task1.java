package Pr1;

public class Task1 implements Function<int[],String>{
    @Override
    public String apply(int[] ints) {
        boolean[] hash=new boolean[ints.length];
        int min;
        String str="";
        boolean end=false;
        while (!end){
            min=10;
            for(int i=0;i<ints.length;++i){
                if(!hash[i] && ints[i]<min ) min=ints[i];
            }
            str+=min;
            for(int i=0;i<ints.length;++i){
                if(ints[i]==min ) hash[i]=true;
            }
            for(int i=0;i<hash.length;++i){
                if(!hash[i]) {
                    end = false;
                    break;
                }
                else end=true;
            }
        }
        return str;
    }
}

