package Vladislav.patterns.structural.adapter;

public class AdapterUsEuropean extends EuropeanSocketPlug implements UsSocketPlug {
    @Override
    public void plugIN() {
        plugInEuropeanPlug();
    }

    @Override
    public void unplug() {
        unpluggingEuropeanPlug();
    }
}
