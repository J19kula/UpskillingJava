package com.revature.jan12.logging;


import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.debug("Intializing Array of Integers");

        ArrayList<Integer> intList = new ArrayList<>();

        //Storing elements into an ArrayList

        logger.debug("Instance of Integer and then add into the list");
        // 1. Instantiate and add
        Integer myInt = new Integer(10);
        intList.add(myInt);

        logger.debug("Instantiating and adding in a single step");
        // 2. Instantiate and add
        intList.add(new Integer(5));

        logger.debug("Adding an int value - demo about auto-boxing");
        // 3. Instantiate with auto-boxing and add
        Integer anotherInt = 7;
        intList.add(anotherInt);

        // 4. Autboxing + add
        intList.add(9);
        intList.add(1);
        intList.add(10);
        intList.add(15);

        logger.debug("Displaying all elements using toString");
        //Retrieve elements of an ArrayList

        //1. Generic - application for all collection - Just printing not accesssing each of the elements
        System.out.println("Using toString()");
        System.out.println(intList.toString()+"\n");

        logger.debug("Positional access");
        //2. Positional Access - Only Applicable for List implementations
        for (int i = 0; i < intList.size(); i++){
            System.out.println("Element at the position "+i+ " is "+intList.get(i));
        }

        logger.debug("Accessing using Iterator");
        //3. Using Iterator - applicable for all Collection implementations
        System.out.println("Using Iterator");
        Iterator<Integer> intIterator = intList.iterator();
        while (intIterator.hasNext()){
            int element = intIterator.next(); // Auto-boxing;
            System.out.println(element);
        }
    }
}
