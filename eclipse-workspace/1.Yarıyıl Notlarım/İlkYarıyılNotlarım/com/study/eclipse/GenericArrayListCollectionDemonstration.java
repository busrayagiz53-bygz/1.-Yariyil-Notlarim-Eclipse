package com.study.eclipse;

import java.util.ArrayList;
public class GenericArrayListCollectionDemonstration {

	public static void main(String[] args) {

		// Generic ArrayList<T> collection demonstration.

		        // Create a new ArrayList of Strings with an initial capacity of 10
		        ArrayList<String> items = new ArrayList<String>();

		        items.add("red"); // append an item to the list
		        items.add(0, "yellow"); // insert "yellow" at index 0

		        // Header
		        System.out.print("Display list contents with counter-controlled loop:");

		        // Display the colors in the list
		        for (int i = 0; i < items.size(); i++) {
		            System.out.printf(" %s", items.get(i));
		        }

		        // Display colors using enhanced for in the display method
		        display(items, "%nDisplay list contents with enhanced for statement:");

		        items.add("green"); // add "green" to the end of the list
		        items.add("yellow"); // add "yellow" to the end of the list
		        display(items, "List with two new elements:");

		        items.remove("yellow"); // remove the first "yellow"
		        display(items, "Remove first instance of yellow:");

		        items.remove(1); // remove item at index 1
		        display(items, "Remove second list element (green):");

		        // Check if a value is in the List
		        System.out.printf("\"red\" is %sin the list%n",
		                items.contains("red") ? "" : "not ");

		        // Display number of elements in the List
		        System.out.printf("Size: %s%n", items.size());
		        String header = "";
		        display(items, header);
		    }

		    // Display the ArrayList's elements on the console
		    public static void display(ArrayList<String> items, String header) {
		        System.out.printf(header); // display header

		        // Display each element in items
		        for (String item : items) {
		            System.out.printf(" %s", item);
		        }
		        System.out.println();
		    }
		}


