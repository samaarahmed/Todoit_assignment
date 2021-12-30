package se.lexicon;

import java.time.LocalDate;

public class TodoItem {

    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        this.id = id;
        this.title = title;
        setTaskDescription(taskDescription);
        setDeadLine(deadLine);
        this.done = done;
        this.creator = creator;
    }

     TodoItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        if (taskDescription == null) {
            throw new IllegalArgumentException("Parameter: String taskDescription was null");
        }
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        if (deadLine == null) {
            throw new IllegalArgumentException("Parameter: LocalDate deadLine was null");
        }
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public String getSummary() {
        return "{Id:" + id + " Title:" + title + "TaskDescription:" + taskDescription
                + "Status:" + done + "Creator:" + creator + "}";
    }

    public boolean isOverdue() {
        LocalDate currentDate = LocalDate.now();
        if (currentDate.compareTo(deadLine) > 0) {
            System.out.println("Current date has passed deadline");
        }
        return true;
    }

}
