package behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {

        LogProcessor logger = new InfoLog( new DebugLog(new ErrorLog(null)));

        logger.log(LogProcessor.ERROR,"error occurred");
        logger.log(LogProcessor.DEBUG,"debug this");
        logger.log(LogProcessor.INFO,"info log");
    }
}
