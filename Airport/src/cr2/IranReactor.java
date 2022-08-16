package cr2;

public class IranReactor {
    private int currentTemp;  //50
    private int maximumTemp;  //100

    public IranReactor(int currentTemp, int maximumTemp) {
        this.currentTemp = currentTemp;
        this.maximumTemp = maximumTemp;
    }

    private void setTempMax(int max){
        if (maximumTemp<max){
            System.out.println("Kaboom");
        }
        this.maximumTemp=max;
    }


}
