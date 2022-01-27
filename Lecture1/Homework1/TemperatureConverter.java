public class TemperatureConverter {
    public static void main(String[] args) {
        int fah = 100;
        int celsius = 0;
        celsius = (int) ((fah - 32.) * 5. / 9.);
        System.out.println(fah+ " °F= " + celsius + "°C");
    }
}
