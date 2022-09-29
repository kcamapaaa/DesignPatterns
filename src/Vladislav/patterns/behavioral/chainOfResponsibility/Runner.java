package Vladislav.patterns.behavioral.chainOfResponsibility;

public class Runner {
    public static void main(String[] args) {
        Checker ageChecker = new AgeChecker(Priority.FIRST_CHECK);
        Checker statusChecker = new StatusChecker(Priority.SECOND_CHECK);

        ageChecker.setNextChecker(statusChecker);

        ageChecker.checkParameters("Everything is OK", Priority.FIRST_CHECK);
        ageChecker.checkParameters("You are not a single.", Priority.SECOND_CHECK);
    }
}

/*
some kind of a dating app where you need to set your age and status
so if there is something wrong on any step you will get an error
 */
