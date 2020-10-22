package designPattern.interpreterPattern;

/**
 * @Description:
 * @PackageName: designPattern.interpreterPattern
 * @Author: csc
 * @Create: 2020-10-22 10:10
 * @Version: 1.0
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) return true;
        return false;
    }
}
