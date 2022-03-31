import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import pro.learnup.javaqa.group2.chernykh4.StatService;

public class Test {

    @ParameterizedTest
    @CsvFileSource(resources = { "income.csv" })
    public void shouldCountIncome(int startIncome, int profit, int expected) {
        StatService test = new StatService(startIncome);

        int actual = test.addIncome(profit);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = { "expenses.csv" })
    public void shouldCountExpenses(int startIncome, int startExpenses, int loss, int expected) {
        StatService test2 = new StatService(startIncome, startExpenses);

        int actual = test2.addExpenses(loss);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = { "tax6.csv" })
    public void shouldCountTax6(int startIncome, double expected) {
        StatService test3 = new StatService(startIncome);

        double actual = test3.sixPercentTax();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = { "tax15.csv" })
    public void shouldCountTax15(int startIncome, int startExpense, double expected) {
        StatService test4 = new StatService(startIncome, startExpense);

        double actual = test4.fifteenPercentTax();

        Assertions.assertEquals(expected, actual);
    }
}
