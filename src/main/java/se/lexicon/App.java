package se.lexicon;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {


        Person person1 = new Person(4,"Samaar","Ahmed","m.samaar@gmail.com" );
        System.out.println("Person:" + person1.toString());
        TodoItem firsttask = new TodoItem(1,"Programming","Work in Java"
                , LocalDate.of(2022,1,24),true,person1);
        System.out.println("Firsttask: " + firsttask.toString());
    }
}