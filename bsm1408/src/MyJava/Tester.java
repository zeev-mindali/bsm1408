package MyJava;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        String[] names = {"zeev","amital","nipo","Adi","Edi","Dronix","AMM","Sapir"};

//        for (int counter=0;counter<names.length;counter++){
//            System.out.print (names[counter]+" ");
//        }

//        for (String item:names){
//            System.out.print(item+" ");
//        }

        Arrays.stream(names).forEach(System.out::println);



    }
}