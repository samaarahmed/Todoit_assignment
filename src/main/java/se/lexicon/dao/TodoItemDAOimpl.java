package se.lexicon.dao;

import se.lexicon.Person;
import se.lexicon.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TodoItemDAOimpl implements TodoItemDAO{

    private List<TodoItem> todoItemList;

    public TodoItemDAOimpl(List<TodoItem> todoItemList) {
        this.todoItemList = todoItemList;
    }

    @Override
    public TodoItem persist(TodoItem todoItem) {
        todoItemList.add(todoItem);
        return todoItem;
    }

    @Override
    public TodoItem findById(int id) {
        for (TodoItem t : todoItemList) {
            if (t.getId()==id) {
                return t;
            }

        }
        return null;
    }

    @Override
    public Collection<TodoItem> findAll() {

        return Collections.unmodifiableCollection(todoItemList);

    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(Boolean done) {
        List<TodoItem> foundtaskbystatus = new ArrayList<>();
        for (TodoItem t : todoItemList) {
            if (t.isDone() == done) {
                foundtaskbystatus.add(t);


            }}
            return Collections.unmodifiableCollection(foundtaskbystatus);

    }
    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
        for (TodoItem t : todoItemList) {
            if(t.getTitle().trim().equalsIgnoreCase(title)){
                return Collections.unmodifiableCollection(todoItemList);
            }
        }

            return null;
    }

    @Override
    public Collection<TodoItem> findByPersonId(int personId) {
       return todoItemList.stream()
                .filter(TodoItem->TodoItem.getCreator().getId()==personId)
                .collect(Collectors.toList());

    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {

        return todoItemList.stream()
                .filter(TodoItem->TodoItem.getDeadLine().isBefore(date))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {
        return todoItemList.stream()
                .filter(TodoItem->TodoItem.getDeadLine().isAfter(date))
                .collect(Collectors.toList());
    }

    @Override
    public void remove(int id) {
        todoItemList.remove(findById(id));
    }
}
