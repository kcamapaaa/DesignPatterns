package Vladislav.patterns.behavioral.memento;
import java.util.Stack;

public class CareTaker {
    Stack<Snapshot> snapshotSet = new Stack<>();

    public void addSnapshot(Snapshot snapshot) {
        snapshotSet.add(snapshot);
    }

    public Snapshot getSnapshot() {
        return snapshotSet.pop();
    }
}
