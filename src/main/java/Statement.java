public class Statement {

    String date;
    Movement movement;

    public Statement(String date, Movement movement) {
        this.date = date;
        this.movement = movement;
    }

    public String date() {
        return date;
    }
}
