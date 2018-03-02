package api;

import java.util.ArrayList;

/*
 * Practice using lists and arrays
 */
public class Lists {
    public static void main(String[] r) {
        System.out.println("Array:");
        String[] array = new String[10];
        array[0] = "a";
    
        for (int i = 0; i < array.length; i++) { // run 10 times 
            System.out.println(array[i]);
        }
    
        System.out.println("List:");
        
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
    
        for (int index = 0; index < list.size(); index++) { // run 1 time
            System.out.println(list.get(index));
        }
        
        
        int[] intArray = new int[10];
        intArray[0] = 12;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(12);
        System.out.println(intList);
    }
}
 
