package org.example.gearBox;

public class GearBox {
    /**
     * 0 - neutral
     * -1 - rear
     * 1-6
     */

    private int rear = -1;

    private int minGear = 1;

    private int maxGear = 6;

    private int gear = 0;


    public int shiftUp() {
        return gear = gear < maxGear ? gear + 1 : gear;
    }


    public int shiftDown() {
        return gear = gear > minGear ? gear - 1 : gear;
    }


    public int shiftRear() {
        return gear = gear > 1 ? gear : rear;
    }

}
