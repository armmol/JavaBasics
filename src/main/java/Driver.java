import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        ArrayOfMultiples.createMultiples();
        System.out.println("Copied Array - " + Arrays.toString(CopyArray.copyArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8})));
        BankAccount bankAccount = new BankAccount(1000);
        System.out.println("Balance after A creation:" + bankAccount.getBalance());
        bankAccount.deposit(500);
        System.out.println("Balance after A after deposit:" + bankAccount.getBalance());
        BankAccount otherBankAccount = new BankAccount(300);
        bankAccount.transferFrom(otherBankAccount, 300);
        System.out.println("Balance after A transfer to B:" + otherBankAccount.getBalance());

        Ferrari ferrari = new Ferrari(2, "V12", "F14", 250);
        ferrari.setDriving(true);
        ferrari.increaseSpeed(150);
        ferrari.increaseSpeed(100);
        ferrari.decreaseSpeed(2000);
        ferrari.decreaseSpeed(20);
    }
}
