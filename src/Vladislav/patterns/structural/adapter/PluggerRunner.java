package Vladislav.patterns.structural.adapter;

public class PluggerRunner {
    public static void main(String[] args) {
        UsSocketPlug usSocketPlug = new AdapterUsEuropean();

        usSocketPlug.plugIN();
        usSocketPlug.unplug();
    }
}
