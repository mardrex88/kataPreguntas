import jdk.jfr.StackTrace;

public class Ammount {
    String type;
    Integer value;

    public Ammount(String type, Integer value) {
        this.type = type;
        this.value = value;
    }

    public String getMessage(){
        String message ="";
        switch (this.type){
            case "Credit":
                message += String.valueOf(this.value)+"             ";
                break;
            case "Debit":
                message += "            "+String.valueOf(this.value);
                break;
            default:

                break;
        }

        return message;
    }
}
