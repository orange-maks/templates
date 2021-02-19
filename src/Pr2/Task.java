package Pr2;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

public class Task {
    public void outList(List<Human> humans){
        for (Human q: humans) {
            System.out.print("Age: "+q.age+"\t\tName: "+q.firstName+"\t\tLastname: "+q.lastName+"\t\tDate: "+q.birthDate+"\tWeight:"+q.weight+"\n");
        }
    }
    public List<Human> generateList(int n){
        List<Human> humans=new ArrayList<>();
        Random random=new Random();
        String first,last;
        LocalDate localDate;
        for(int i=0;i<n;++i){
            first="";last="";
            first+=(char)('Z'-i);
            last+=(char)('A'+i);
            localDate=LocalDate.of(random.nextInt(200)+1900,random.nextInt(12)+1,random.nextInt(30)+1);
            humans.add(new Human(random.nextInt(90)+10,first,last,localDate,random.nextInt(60)+40));
        }
        return humans;
    }
    public void sortByName(List<Human> humans){
        humans.stream().sorted(Comparator.comparing(Human::getFirstName,(s1,s2)->{
            return s1.compareTo(s2);
                })).forEach(System.out::println);
    }
    public void sortByLastName(List<Human> humans){
        humans.stream().sorted(Comparator.comparing(Human::getLastName,(s1,s2)->{
            return s1.compareTo(s2);
        })).forEach(System.out::println);
    }
    public void filtres(List<Human> humans){
        humans.stream().filter(new Predicate<Human>() {
            @Override
            public boolean test(Human human) {
                return human.birthDate.compareTo(LocalDate.of(2000, 6, 24)) > 0;
            }
        }).forEach(System.out::println);
    }
    public int sumAge(List<Human> humans){
        return humans.stream().map(h -> h.age).reduce(0,(a,b)->a+b);
    }
}
