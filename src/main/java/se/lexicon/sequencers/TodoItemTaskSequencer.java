package se.lexicon.sequencers;

public class TodoItemTaskSequencer {
    private static int currentId;

    public static int nextId(){
        return ++currentId;

    }
    public static int getCurrentId(){
        return currentId;
    }
    public static void setCurrentId(int currentId){
        TodoItemTaskSequencer.currentId = currentId;
    }
}
