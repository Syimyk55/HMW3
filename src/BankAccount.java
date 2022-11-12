public class BankAccount {
    private double amount;

    public double deposit(double sum) {
        return amount = (sum + amount);
    }

    public double getAmount() {
        return amount;
    }

    public int withDraw(int sum) throws LimitException {
        if ((amount = amount - sum) < sum) {
            if (amount <= 0.0) {
                amount = 0;
            }

            throw new LimitException("Ошибка! На карте недостаточно средств ! Ваш остаток: ", amount);

        }
        return sum;
    }
}
