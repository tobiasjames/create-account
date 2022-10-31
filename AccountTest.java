public class AccountTest {
    public static void main(String[] args) {
        Account toby = new Account(1122, 20000);
        toby.setAnnualInterestRate(4.5);
        toby.withdraw(2500);
        toby.deposit(3000);
        System.out.println(toby.getId());
        System.out.println(toby.getBalance());
        System.out.println(toby.getMonthlyInterestRate());
        System.out.println(toby.getDateCreated());
        Account john = new Account();
        john.withdraw(2500);
        john.deposit(0);
    }
}
