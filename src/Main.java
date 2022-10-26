public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 48.7f; // в килограммах
        float height = 1.6f; // в метрах
        float bmi = service.calculate(weight, height);
        System.out.println(bmi);

    }
}