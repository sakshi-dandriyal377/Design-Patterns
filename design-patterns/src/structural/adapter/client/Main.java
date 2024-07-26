package structural.adapter.client;

import structural.adapter.adaptee.WeightMachineForBabies;
import structural.adapter.adapter.WeightMachineAdapter;
import structural.adapter.adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter adapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(adapter.getWeightInKg());

    }
}
