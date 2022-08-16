package cr2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReactorTester {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        IranReactor iranReactor = new IranReactor(50,100);

        //תיחקור
        Class iranReflect = iranReactor.getClass();
        Field[] fields = iranReflect.getDeclaredFields();
        Arrays.stream(fields).forEach(System.out::println);

        Method[] methods = iranReflect.getDeclaredMethods();
        Arrays.stream(methods).forEach(System.out::println);
        methods[0].setAccessible(true);
        methods[0].invoke(iranReactor,200);

        }
    }

