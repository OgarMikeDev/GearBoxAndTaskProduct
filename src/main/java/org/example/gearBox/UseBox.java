package org.example.gearBox;

public class UseBox {

    public static void main(String[] args) {
        GearBox gearBox = new GearBox();
        gearBox.shiftUp();
        gearBox.shiftUp();
        gearBox.shiftUp();
        System.out.println(gearBox.shiftRear());
    }
}
