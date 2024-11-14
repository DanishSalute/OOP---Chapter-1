public class Celsius {
    public void convertCelsius(float userTemperature){
        double celsius = ((userTemperature)- 32) * 5/9;
        System.out.printf("The temperature is %.2f °C", celsius);
    }
}
