package parser;

public class ReduceAction extends Action {
    public ReduceAction(int number) {
        super(act.reduce, number);
    }

    public String toString() {
        return "r" + number;
    }
}
