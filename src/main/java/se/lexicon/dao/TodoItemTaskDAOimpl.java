package se.lexicon.dao;

import se.lexicon.TodoItem;
import se.lexicon.TodoItemTask;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TodoItemTaskDAOimpl implements TodoItemTaskDAO{

    private List<TodoItemTask> todoItemTaskList;

    public TodoItemTaskDAOimpl(List<TodoItemTask> todoItemTaskList) {
        this.todoItemTaskList = todoItemTaskList;
    }

    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        todoItemTaskList.add(todoItemTask);
        return todoItemTask;
    }

    @Override
    public TodoItemTask findById(int id) {

        for (TodoItemTask t:todoItemTaskList)
        {
            if(t.getId()==id){
                return t;
            }

        }
        return null;
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return Collections.unmodifiableCollection(todoItemTaskList);
    }

    @Override
    public Collection<TodoItemTask> findByAssignedStatus(boolean assigned) {
        return todoItemTaskList.stream()
                .filter(TodoItemTask->TodoItemTask.isAssigned()==assigned)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(int personId) {
        return todoItemTaskList.stream()
                .filter(TodoItemTask->TodoItemTask.getAssignee().getId()==personId)
                .collect(Collectors.toList());
    }

    @Override
    public void remove(int id) {
         todoItemTaskList.remove(findById(id));
    }
}
