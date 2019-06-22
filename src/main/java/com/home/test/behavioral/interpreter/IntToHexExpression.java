package main.behavioral.interpreter;

/**
 * Created by Sara on 10/5/2017.
 */
public class IntToHexExpression implements Expression {

    private int i;

    public IntToHexExpression(int c) {
        this.i = c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(i);
    }
}
