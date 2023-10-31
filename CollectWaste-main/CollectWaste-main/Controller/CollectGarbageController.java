/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.GarbageCollection;
import Repository.CollectGarbage;
import View.Menu;

/**
 *
 * @author HI
 */
public class CollectGarbageController extends Menu<String> {
    private CollectGarbage collectGarbage;
    static String[] options = {
        "Calculate cost of collecting garbage",
        "Exit"
    };
    private GarbageCollection gc;
    public CollectGarbageController() {
        super("========= COST CALCULATOR PROGRAM =========", options);
        collectGarbage = new CollectGarbage();
    }
    
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1: {
                gc = new GarbageCollection();
                System.out.println("Total cost estimated: " + collectGarbage.CollectingGarbage(gc));
                break;
            }
            case 2: {
                System.exit(0);
            }
        }
    }
    
}
