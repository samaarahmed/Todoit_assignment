package se.lexicon.dao;

import se.lexicon.Person;
import se.lexicon.TodoItem;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TodoItemDAOimpl implements TodoItemDAO{

    private List<TodoItem> todoItemList;

    public TodoItemDAOimpl(List<TodoItem> todoItemList) {
        this.todoItemList = todoItemList;
    }

    @Override
    public TodoItem persist(TodoItem todoItem) {
        todoItemList.add(todoItem);
        return null;
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
        for (TodoItem t : todoItemList) {
            t.isDone();


        }
        return Collections.unmodifiableCollection(todoItemList);
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByPersonId(String personId) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {
        return null;
    }

    @Override
    public void remove(TodoItem id) {
        todoItemList.remove(id);
    }
}
