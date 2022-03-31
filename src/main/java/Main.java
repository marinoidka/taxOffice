import pro.learnup.javaqa.group2.chernykh4.StatService;

public class Main {

    public static void main(String[] args) {

        StatService count = new StatService(10000, 5000);
        count.addIncome(1000);
        count.addExpenses(500);
        count.addIncome(200);
        count.addExpenses(300);
        double tax6 = count.sixPercentTax();
        double tax15 = count.fifteenPercentTax();

        System.out.println("Налог 6% на доход равен: " + tax6);
        System.out.println("Налог 15% на разницу равен: " + tax15);

    }
}
