package HW2.impl;

import HW2.Human;

public class Doctor extends Human {
    public Doctor(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Curing animals...");
    }
}