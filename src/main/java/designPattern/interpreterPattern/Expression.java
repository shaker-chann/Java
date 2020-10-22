package designPattern.interpreterPattern;

/**
 * @Description:
 * @PackageName: designPattern.interpreterPattern
 * @Author: csc
 * @Create: 2020-10-22 10:09
 * @Version: 1.0
 */
public interface Expression {
    public boolean interpret(String context);
}
