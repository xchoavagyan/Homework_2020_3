package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	/*
        1. create a new array list, add some colors (string) and print out the collection
        2. iterate through all elements in a array list
        3. insert an element into the array list at the first position.
        4. retrieve an element (at a specified index) from a given array list.
        5. update specific array element by given element.
        6. remove the third element from a array list.
        7. search an element in a array list.
        8. sort a given array list.
        9. copy one array list into another.
        10. reverse elements in a array list.
        11. compare two array lists.
        12. Write a program of swap two elements in an array list.
        13. join two array lists.
        14. clone an array list to another array list.
        15. empty an array list.
        16. test an array list is empty or not.
        17. replace the second element of a ArrayList with the specified element.
	 */

        //1
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Indigo");
        colors.add("Violet");
        //2
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        //3
        colors.add(0, "Black");
        //4
        String color = colors.get(2);
        System.out.println(color);
        //5
        colors.set(3, "Black");
        //6
        colors.remove(3);
        //7
        if (colors.contains("Violet")) {
            System.out.println(colors.indexOf("Violet"));
        }
        //8
        Collections.sort(colors);
        //9
        ArrayList<String> copyOfColors = new ArrayList<>();
        copyOfColors.add("white");
        copyOfColors.add("white");
        copyOfColors.add("white");
        copyOfColors.add("white");
        copyOfColors.add("white");
        copyOfColors.add("white");
        copyOfColors.add("white");
        Collections.copy(copyOfColors,colors);
        //10
        Collections.reverse(colors);
        //11
        for (int i = 0; i <colors.size() ; i++) {
            if (colors.get(i).equals(copyOfColors.get(i))){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        //12
        Collections.swap(colors,2,6);
        //13
        ArrayList<String> joinedArrayList = new ArrayList<>();
        joinedArrayList.addAll(colors);
        joinedArrayList.addAll(copyOfColors);
        //14
        ArrayList<String> clonedArrayList = (ArrayList<String>) colors.clone();
        for (int i = 0; i < clonedArrayList.size(); i++) {
            System.out.println(clonedArrayList.get(i));
        }
        //15
        joinedArrayList.removeAll(joinedArrayList);
        //16
        System.out.println(joinedArrayList.isEmpty());
        System.out.println(clonedArrayList.isEmpty());
        //17
        clonedArrayList.set(0,color);
    }
}
