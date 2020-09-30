package designPattern.ChainOfResponsibilityPattern;

/**
 * @Description:
 * @PackageName: designPattern.ChainOfResponsibilityPattern
 * @Author: csc
 * @Create: 2020-09-30 11:23
 * @Version: 1.0
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("error Console :: Logger:" + message);
    }
}
