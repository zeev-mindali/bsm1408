package class_reflaction;

public abstract class AbstractClass {
    public int tailLength;
    public String color;
    public int age;

    public AbstractClass(int tailLength, String color, int age) {
        this.tailLength = tailLength;
        this.color = color;
        this.age = age;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    abstract String makeSound();
    abstract int numOfFights();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
