package cr7;

import java.lang.reflect.Array;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] grades = new int[10];

        //daniel camed to class , we need more seats
        grades=enlargeArray(20);

        grades = (int[])doubleArray(int.class,100);
    }

    public static int[] enlargeArray(int newSize){
        //copy old array to new array
        int[] newArray = new int[newSize];
        return newArray;
    }

    public static Object doubleArray(Class componentType, int newSize){
        Object result = Array.newInstance(componentType,20);
        return result;
    }
}
