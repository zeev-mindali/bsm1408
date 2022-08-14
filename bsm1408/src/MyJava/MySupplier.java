package MyJava;

import java.util.List;
import java.util.function.Supplier;

public class MySupplier {
    static Supplier<List<String>> getDBConnection = ()-> List.of("jdbc://localHost:5432/customers","jdbc://192.168.1.10/customers");
    static List<String> myDB = List.of("jdbc://localHost:5432/customers","jdbc://192.168.1.10/customers");

    public static void main(String[] args) {
        System.out.println(getDBConnection.get());
    }
}
