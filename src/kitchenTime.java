public class kitchenTime {
    public static void main(String[] args){
        int temperatureLow,temperatureMiddle, temperatureHigh, time;
        temperatureLow = 100;
        temperatureMiddle = 400;
        temperatureHigh = 1000;
        time = 41;
        String result = time > 40 ? " Мясо сгорело" : time < 35 ? "Мясо готовиться" : "Мясо готово";
        System.out.println (result);
    }
}
