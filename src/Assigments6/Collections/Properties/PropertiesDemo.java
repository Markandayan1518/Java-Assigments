package Assigments6.Collections.Properties;

public class PropertiesDemo {

    static int balance = 1000;

    public static void main(String[] args) {
        try {
            int amountToDeposit = 1000;
            int amountToWithdraw = 20000;

            PropertiesDemo.deposit(amountToDeposit);
            PropertiesDemo.withdraw(amountToWithdraw);
        } catch (Exception exception) {
            //getProperty method returns the value from the properties file that corresponds to the key passed to it as argument
            System.out.println(AppConfig.PROPERTIES.getProperty(exception.getMessage()));
        }

    }

    public static void deposit(int amt) throws Exception {
        //negative amount cannot be deposited
        if (amt < 0) {
            throw new Exception("PropertiesTester.INVALID_AMOUNT");
        }
        balance = balance + amt;

        String message = AppConfig.PROPERTIES.getProperty("PropertiesTester.TRANSACTION_SUCCESS", "Transaction successful");
        System.out.println(message);
        System.out.println("The final balance is:" + balance);
    }

    public static void withdraw(int amt) throws Exception {
        //negative amount cannot be withdrawn
        if (amt < 0) {
            throw new Exception("PropertiesTester.INVALID_AMOUNT");
        }

        if (balance - amt < 0) {
            throw new Exception("PropertiesTester.TRANSACTION_FAILURE");
        } else {
            balance = balance - amt;
            String message = AppConfig.PROPERTIES.getProperty("PropertiesTester.TRANSACTION_SUCCESS", "Transaction successful");
            System.out.println(message);
            System.out.println("The final balance is:" + balance);
        }

    }

}
