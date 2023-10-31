/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Common.Library;

/**
 *
 * @author HI
 */
public class GarbageCollection {
    private int[] ListOfGarbage;
    private int numOfStation;

    public GarbageCollection() {
        Library library = new Library();
        this.numOfStation = library.inputInt("Enter number of garbage station: ", 0);
        this.ListOfGarbage = library.inputArray("Enter amount of garbage at stations: ", numOfStation);
    }

    public int[] getListOfGarbage() {
        return ListOfGarbage;
    }

    public void setListOfGarbage(int[] ListOfGarbage) {
        this.ListOfGarbage = ListOfGarbage;
    }
    
    
}
