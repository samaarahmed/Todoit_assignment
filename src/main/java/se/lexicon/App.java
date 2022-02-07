package se.lexicon;

import se.lexicon.dao.TodoItemDAO;
import se.lexicon.dao.TodoItemDAOimpl;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {


        Person person1 = new Person(4,"Samaar","Ahmed","m.samaar@gmail.com" );
        System.out.println("Person:" + person1.toString());
        TodoItem firsttask = new TodoItem(1,"Programming","Work in Java"
                , LocalDate.of(2022,1,24),true,person1);
        TodoItem secondtask = new TodoItem(2,"cleaning",
                "cleaning room", LocalDate.of(2022,2,2),true, person1);
        TodoItem thirdtask = new TodoItem(3, "shoping", "shoping for kids",
                LocalDate.of(2022,2,5),false, person1 );

        TodoItemDAO taskstorage = new TodoItemDAOimpl(new ArrayList<>());

        taskstorage.persist(firsttask);
        taskstorage.persist(secondtask);
        taskstorage.persist(thirdtask);
        taskstorage.findAll().forEach(System.out::println);
        System.out.println("Find by done status list");
        taskstorage.findAllByDoneStatus(false).forEach(System.out::println);



      //  System.out.println("Firsttask: " + firsttask.toString());
    }
}