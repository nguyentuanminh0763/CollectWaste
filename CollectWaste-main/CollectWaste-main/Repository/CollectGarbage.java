/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.GarbageCollection;

/**
 *
 * @author HI
 */
public class CollectGarbage {
    private int time;
    private int totalWaste;
    private int numOfTrucks;
    static final int TRUCK_CAPACITY = 10000;
    static final int COST_PER_TRUCK = 57000;
    static final int COST_PER_HOUR = 120000;
    public CollectGarbage(){
        time = 0;
        totalWaste = 0;
        numOfTrucks = 0;
    }
    
    public double CollectingGarbage(GarbageCollection gc) {
        int[] ListOfGarbage = gc.getListOfGarbage();
        for (int i = 0; i < ListOfGarbage.length; i++) {
            if (totalWaste + ListOfGarbage[i] <= TRUCK_CAPACITY) {
                totalWaste += ListOfGarbage[i];
                time += 8;
            }
            else {
                totalWaste = ListOfGarbage[i];
                time += 38;
                numOfTrucks ++;
            }
        }
        if (totalWaste > 0) numOfTrucks ++;
        time += 30;
        System.out.println("time: " + time);
        System.out.println("trucks: " + numOfTrucks);
        int cost =(int)(numOfTrucks * COST_PER_TRUCK + time * COST_PER_HOUR / 60);
        return cost;
    }
    
}
