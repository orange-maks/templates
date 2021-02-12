package Pr2;

import java.time.LocalDate;

public class Human {
    public int age;
    public String firstName, lastName;
    public LocalDate birthDate;
    public int weight;

    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Age: "+age+"\t\tName: "+firstName+"\t\tLastname: "+lastName+"\t\tDate: "+birthDate+"\tWeight:"+weight;
    }
}
