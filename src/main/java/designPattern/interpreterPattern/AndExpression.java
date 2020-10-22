package designPattern.interpreterPattern;

/**
 * @Description:
 * @PackageName: designPattern.interpreterPattern
 * @Author: csc
 * @Create: 2020-10-22 10:14
 * @Version: 1.0
 */
public class AndExpression implements Expression {
    private Expression expression1;
    private Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
