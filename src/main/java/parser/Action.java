package parser;

abstract public class Action {
    public act action;
    //if action = shift : number is state
    //if action = reduce : number is number of rule
    public int number;

    public Action(act action, int number) {
        this.action = action;
        this.number = number;
    }

    abstract public String toString();
}

enum act {
    shift, reduce, accept
}

