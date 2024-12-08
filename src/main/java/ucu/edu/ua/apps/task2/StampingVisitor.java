package ucu.edu.ua.apps.task2;

public class StampingVisitor implements Visitor {

    private String uuid;

    public StampingVisitor(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public void visitTask(Task<?> task) {
        task.setHeader("uuid", uuid);
    }

}