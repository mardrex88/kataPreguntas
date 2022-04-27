
public class StartApp {


    public static void main(String[] args) {

        Account account = new Account();
        
        account.deposit(10000, "10/01/2021");
        account.deposit(2000,"13/01/2021");
        account.withdrawal(5000, "14/01/2021");
         account.printStatements();
    }
}
