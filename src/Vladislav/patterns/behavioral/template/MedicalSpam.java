package Vladislav.patterns.behavioral.template;

public class MedicalSpam implements SpamTemplate {
    @Override
    public void theme() {
        System.out.println("If you wanna buy some medicine");
    }
}
