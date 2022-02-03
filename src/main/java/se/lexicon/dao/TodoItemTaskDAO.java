package se.lexicon.dao;

import se.lexicon.TodoItemTask;

import java.util.Collection;

public interface TodoItemTaskDAO {

    TodoItemTask persist(TodoItemTask todoItemTask);
    TodoItemTask findById(int id);
    Collection<TodoItemTask> findAll();
    Collection<TodoItemTask> findByAssignedStatus(boolean done);
    Collection<TodoItemTask> findByPersonId(String personId);
    Void remove(int id);

}
