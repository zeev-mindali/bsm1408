package class_reflaction;

public class MyConstructor {
    private int hour;
    private int min;

    //with no number -> 00:00
    //only with hour -> 02:00
    //full time -> 05:10

    public MyConstructor(int h, int m) {
        setHour(h);
        setMin(m);
    }

    public MyConstructor(int h) {
        this(h, 0);
    }

    public MyConstructor() {
        this(0, 0);
    }

    public void setHour(int hour) {
        this.hour = hour % 24;
    }

    public void setMin(int min) {
        this.min = min % 60;
    }
}
