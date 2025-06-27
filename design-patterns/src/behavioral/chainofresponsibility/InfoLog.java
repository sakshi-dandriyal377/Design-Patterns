package behavioral.chainofresponsibility;

public class InfoLog extends LogProcessor{

    public InfoLog(LogProcessor nextLogger) {
        super(nextLogger);
    }//setting the next logger

    @Override
    public void log(int level, String message) {
        if(level == INFO){
            System.out.println("INFO : "+ message);
        }
        else
            super.log(level,message); // to call parent class method
        //calling next logger
    }
}
