package class_reflaction;

import java.util.ArrayList;
import java.util.List;

public class DanielProblem {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        verifyInterface(Object.class);
    }

    public static void verifyInterface(Class cls){
        String name = cls.getName();
        System.out.println(name);
        if (cls.isInterface()){
            System.out.println("Interface");
        } else {
            System.out.println("Class");
        }

    }
}
