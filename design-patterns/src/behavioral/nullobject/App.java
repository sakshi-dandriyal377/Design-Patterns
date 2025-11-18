package behavioral.nullobject;

class App {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("none");

        // No null checks needed!
        logger.log("Application started"); // no output

        logger = LoggerFactory.getLogger("console");
        logger.log("Application started");
    }
}

