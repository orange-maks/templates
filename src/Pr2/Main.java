package Pr2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task task=new Task();
        List<Human> humans=task.generateList(5);
        task.outList(humans);
        System.out.println("-------------------------SORT_BY_NAME-------------------------");
        task.sortByName(humans);
        System.out.println("-------------------------SORT_BY_Last-------------------------");
        task.sortByLastName(humans);
        System.out.println("----------------------------FILTER-------------------------");
        task.filtres(humans);
        System.out.println("SumAge = "+ task.sumAge(humans));
    }

}
