package Vladislav.patterns.behavioral.chainOfResponsibility;

public abstract class Checker {
    Checker nextChecker;
    private int priority;

    public Checker(int priority) {
        this.priority = priority;
    }

    public void setNextChecker(Checker checker) {
        nextChecker = checker;
    }

    public void checkParameters(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (nextChecker != null) {
            nextChecker.checkParameters(message, level);
        }
    }

    public abstract void write(String message);
}
