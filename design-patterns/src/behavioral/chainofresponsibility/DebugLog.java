package behavioral.chainofresponsibility;

public class DebugLog extends LogProcessor{
    public DebugLog(LogProcessor nextLogger) {
        super(nextLogger);
    }//setting next logger

    @Override
    public void log(int level, String message) {
        if(level == DEBUG){
            System.out.println("DEBUG : "+ message);
        }
        else
             super.log(level, message);
    }
}
