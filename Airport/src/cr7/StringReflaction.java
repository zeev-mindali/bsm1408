package cr7;

public class StringReflaction {


    public static void main(String[] args) {
        String[] strings = {"Hello","CPP"};
        Object[] objects = {"Hello","C++"};
        int[] numbers={1,2,3,4,58,1013};
        long[] longs ={132,543,845,3874};
        double[] doubles = {1.1,2.2,3.3,4.4,5.5};
        String student="avial";
        Object student2="ofek";

        printArrayType(strings);
        printArrayType(objects);
        printArrayType(numbers);
        printArrayType(longs);
        printArrayType(doubles);
        printArrayType(student);
        printArrayType(student2);
    }

    //print array type
    public static void printArrayType(Object target){
        Class targetClass = target.getClass();
        if (targetClass.isArray()){
            String fieldName = targetClass.getName();
            Class fieldType = targetClass.getComponentType();
            System.out.println("name: "+fieldName+", Type: "+fieldType);
        } else {
            System.out.println(targetClass.getName()+" Not an array");
        }
    }
}
