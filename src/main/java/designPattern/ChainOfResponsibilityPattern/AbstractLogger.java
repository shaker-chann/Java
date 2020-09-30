package designPattern.ChainOfResponsibilityPattern;

/**
 * @Description:
 * @PackageName: designPattern.ChainOfResponsibilityPattern
 * @Author: csc
 * @Create: 2020-09-30 11:16
 * @Version: 1.0
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level < level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
