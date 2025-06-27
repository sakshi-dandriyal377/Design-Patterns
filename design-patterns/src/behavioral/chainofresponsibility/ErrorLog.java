package behavioral.chainofresponsibility;

public class ErrorLog extends LogProcessor{
    public ErrorLog(LogProcessor nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int level, String message) {
        if(level == ERROR)
            System.out.println("ERROR : "+ message);
        else
            super.log(level, message);
    }
}
