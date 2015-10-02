package chainOfResponsibilityPattern;

public class ChainPatternDemo {
	
	private static AbstractLogger getChainOfLoggers(){
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
	
	public static void main(String[] args){
		
		AbstractLogger loggerChain = getChainOfLoggers();
		
		loggerChain.logMessage(AbstractLogger.DEBUG, "DebugMessages");
		loggerChain.logMessage(AbstractLogger.INFO, "InfoMessages");
		loggerChain.logMessage(AbstractLogger.ERROR, "ErrorMessages");
		
	}
}
