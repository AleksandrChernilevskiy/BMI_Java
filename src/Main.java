public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(185, 65);
        System.out.println("Индекс массы тела " + (int)bmi);
        System.out.println("Категория                        ИМТ");
        System.out.println("Острый дефицит массы            < 16");
        System.out.println("Недостаточная масса тела   16 - 18.5");
        System.out.println("Норма                      18.6 - 25");
        System.out.println("Избыточная масса тела      25.1 - 30");
        System.out.println("Ожирение первой степени    30.1 - 35");
        System.out.println("Ожирение второй степени    35.1 - 40");
        System.out.println("Ожирение третьей степени      > 40.1");
    }
}