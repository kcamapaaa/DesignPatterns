package Vladislav.patterns.behavioral.template;

public class Runner {
    public static void main(String[] args) {
        SpamTemplate medicine = new MedicalSpam();
        SpamTemplate magic = new MagicSpam();
        SpamTemplate iphone = new IphoneSpam();

        medicine.showspamMessage();
        System.out.println("\n========================\n");
        magic.showspamMessage();
        System.out.println("\n========================\n");
        iphone.showspamMessage();
    }
}
