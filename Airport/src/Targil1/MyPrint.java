package Targil1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyPrint {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        //System.out.println("Hello world!!!");

        Class<?> systemClass = java.lang.Class.forName("java.lang.System");
        Field outField = systemClass.getDeclaredField("out");
        Class<?> printStreamClass = outField.getType();
        Method printLnMethod = printStreamClass.getDeclaredMethod("println", String.class);

        Object object = outField.get(null);
        printLnMethod.invoke(object,"Hello Class/Basmach/Aviel");
    }
}
