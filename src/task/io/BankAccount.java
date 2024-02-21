package task.io;
// TODO: Создайте класс, который представляет банковский счет. Реализуйте метод для снятия денег со
//  счета. Обработайте исключение, если на счете недостаточно средств.

public class BankAccount extends Exception {
    int score;
    int withdrawal;

    BankAccount(int score, int withdrawal) {
        this.score = score;
        this.withdrawal = withdrawal;
    }

    public static void withdrawalOfMoney(int score, int withdrawal) throws Exception {
        ;

        if (score >= withdrawal) {
            score -= withdrawal;
            System.out.println(score);
        } else {
            throw new Exception("сумма на счете должна быть не меньше суммы снятия");
        }
    }

    public static void main(String[] args) throws Exception {
        BankAccount.withdrawalOfMoney(14, 15);
    }
}
