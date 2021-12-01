public class Main {
    public static void main(String[] args) {
        int start_balance = 100;
        int income = 1550;
        int count = 100;
        int bonus;
        if (income > 1000) {
            bonus = income / count;
        } else {
            bonus = 0;
        }
        int end_balance = start_balance + income + bonus;
        System.out.println(bonus + " руб. бонус");
        System.out.println(end_balance + " руб. баланс счета");
    }
}
