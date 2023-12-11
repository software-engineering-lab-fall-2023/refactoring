package parser;

public class AcceptAction extends Action {
    public AcceptAction(int number) {
        super(act.accept, 0);
    }

    public String toString() {
        return "acc";
    }
}
