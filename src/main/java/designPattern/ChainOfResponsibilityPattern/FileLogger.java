package designPattern.ChainOfResponsibilityPattern;

/**
 * @Description:
 * @PackageName: designPattern.ChainOfResponsibilityPattern
 * @Author: csc
 * @Create: 2020-09-30 11:23
 * @Version: 1.0
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("file :: Logger:" + message);
    }
}
