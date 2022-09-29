package Vladislav.patterns.behavioral.state;

public interface EmailState {
    void next(Email email);
    void prev(Email email);
    void printStatus();
}
