public class Main {
    public static void main(String[] args) {
        BmiService ind = new BmiService();
        int bmi1 = ind.calculate((int) 98F, 1.87F);
        System.out.println("Индекс массы тела: " + bmi1);

    }
}