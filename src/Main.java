public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 60;
        double h = 1.70;
        double total = m / (h * h);
        double bmi = service.calculate(total);
        System.out.println(bmi);
    }
}