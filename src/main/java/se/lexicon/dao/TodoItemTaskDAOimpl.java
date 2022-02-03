package se.lexicon.dao;

import se.lexicon.TodoItemTask;

import java.util.Collection;
import java.util.List;

public class TodoItemTaskDAOimpl implements TodoItemTaskDAO{

    private List<TodoItemTask> todoItemTaskList;

    public TodoItemTaskDAOimpl(List<TodoItemTask> todoItemTaskList) {
        this.todoItemTaskList = todoItemTaskList;
    }

    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        return null;
    }

    @Override
    public TodoItemTask findById(int id) {
        return null;
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return null;
    }

    @Override
    public Collection<TodoItemTask> findByAssignedStatus(boolean done) {
        return null;
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(String personId) {
        return null;
    }

    @Override
    public Void remove(int id) {
        return null;
    }
}
