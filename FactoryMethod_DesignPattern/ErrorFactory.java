package FactoryMethod_DesignPattern;

public class ErrorFactory implements ILoggerFactory {
  public ILogger createLogger(){
    return new ErrorLogger();
  }
}
