public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        int index = service.calculate(180, 70);
        System.out.println("Your Body Mass Index is " + index);

        int index1 = service.calculate(110, 70);
        System.out.println("Your Body Mass Index is " + index1);

        int index2 = service.calculate(180, 50);
        System.out.println("Your Body Mass Index is " + index2);

        int index3 = service.calculate(180, 100);
        System.out.println("Your Body Mass Index is " + index3);
    }
}
