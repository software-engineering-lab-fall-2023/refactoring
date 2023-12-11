package parser;

public class ShiftAction extends Action {
    public ShiftAction(int number) {
        super(act.shift, number);
    }
    
    public String toString() {
        return "s" + number;
    }
}
