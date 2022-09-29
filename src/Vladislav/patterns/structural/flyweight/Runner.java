package Vladislav.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        WaitressFactory waitressFactory = new WaitressFactory();

        List<Waitress> waitressList = new ArrayList<>();

        waitressList.add(waitressFactory.getWaitressByName("Masha"));
        waitressList.add(waitressFactory.getWaitressByName("Masha"));
        waitressList.add(waitressFactory.getWaitressByName("Masha"));
        waitressList.add(waitressFactory.getWaitressByName("Masha"));
        waitressList.add(waitressFactory.getWaitressByName("Galya"));
        waitressList.add(waitressFactory.getWaitressByName("Galya"));
        waitressList.add(waitressFactory.getWaitressByName("Galya"));
        waitressList.add(waitressFactory.getWaitressByName("Galya"));
        waitressList.add(waitressFactory.getWaitressByName("Galya"));
        waitressList.add(waitressFactory.getWaitressByName("Galya"));
        waitressList.add(waitressFactory.getWaitressByName("Masha"));
        waitressList.add(waitressFactory.getWaitressByName("Masha"));
        waitressList.add(waitressFactory.getWaitressByName("Masha"));
        waitressList.add(waitressFactory.getWaitressByName("Masha"));
        waitressList.add(waitressFactory.getWaitressByName("Masha"));

        for (Waitress waitress : waitressList) {
            waitress.doJob();
        }
    }
}
