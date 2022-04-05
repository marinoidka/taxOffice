package pro.learnup.javaqa.group2.chernykh4;

public class StatService {
    int startIncome;
    int startExpense;

    public StatService(int startIncome, int startExpense) {
        this.startIncome = startIncome;
        this.startExpense = startExpense;
    }

    public StatService(int startIncome) {
        this.startIncome = startIncome;
    }



    public int addIncome(int profit) {
        if (profit < 0) {
            System.out.println(" Неверно введен доход ");
        } else if(startIncome < 0) {
            System.out.println(" Неверно введен доход ");
        }
        startIncome = this.startIncome + profit;
        return startIncome;
    }

    public int addExpenses(int loss) {
        if (loss < 0) {
            System.out.println(" Неверно введен расход ");
        } else if(startExpense < 0) {
            System.out.println(" Неверно введен расход ");
        }
        startExpense = this.startExpense + loss;
        return startExpense;
    }

    public double sixPercentTax() {
        double tax6 = startIncome * 0.06;
        return tax6;
    }

    public double fifteenPercentTax() {
        int budget = startIncome - startExpense;
        double tax15;
        if (budget > 0) {
            tax15 = budget * 0.15;
        } else {
            tax15 = 0;
        }
        return tax15;
    }

}
