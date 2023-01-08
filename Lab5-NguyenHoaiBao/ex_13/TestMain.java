package lab_5.ex_13;

public class TestMain {
    public static void main(String[] args) {

        Customer customer1 = new Customer(123, "HoaiBao", 'm');
        System.out.println(customer1);
        Customer customer2 = new Customer(124, "NgocAnh", 'm');
        Account account1 = new Account(1234, customer1, 2000.0);
        Account account2 = new Account(1244, customer2, 2100.0);
        System.out.println(account1);
        account1.deposit(200);
        System.out.println(account1);
        System.out.println(account1.withdraw(100));
        System.out.println(account1);

    }
}
