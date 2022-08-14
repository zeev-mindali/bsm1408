package MyJava;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Function;

public class MyFunctions {
    static Function<Integer,Integer> incByOneFunc = number->number+1;

    Function <Integer,Integer> mulBy10 = number->number*10;

    static Function<Integer,Integer> incByAndMulBy10 = incByOneFunc.andThen(mulBy10);
    public static void main(String[] args) {
        //Function<T,T> name = <Expression>
        int inc2 = incByOneFunc.apply(1);

        int inc3 = incByAndMulBy10.apply(10);
        System.out.println(inc2);
        System.out.println(inc3);
    }

    static int increaseByOne(int number){
        return number+1;
    }

    static int mult(int number, int mult){
        return increaseByOne(number)*mult;
    }

}
