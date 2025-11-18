package behavioral.nullobject;

class LoggerFactory {
    public static Logger getLogger(String type) {
        if ("console".equalsIgnoreCase(type)) {
            return new ConsoleLogger();
        }
        return new NullLogger();   // Instead of returning null
    }
}

