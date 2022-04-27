import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Account {
    Integer balance;
    List<Statement> history;

    public Account() {
        this.balance = 0;
        this.history = new ArrayList<>();
    }

    void deposit(int ammount,String date) {
        this.balance+=ammount;
        this.history.add(new Statement(date,new Movement(this.balance,new Ammount("Credit",ammount))));
    }

    void withdrawal(int ammount, String date){
        this.balance-=ammount;
        this.history.add(new Statement(date,new Movement(this.balance,new Ammount("Debit",ammount))));
    }

    void printStatements() {
        System.out.println("Date            "+"Credit   " + "   Debit      " + "balance" );
        for (int i=this.history.size()-1;i>=0;i--) {
            System.out.println(this.history.get(i).date() + "       "+this.history.get(i).movement.ammount.getMessage() + "        " + String.valueOf(this.history.get(i).movement.balance) );
        }
    }
}
