package FactoryMethod_DesignPattern;

public class DebugFactory implements ILoggerFactory {
  public ILogger createLogger(){
    return new DebugLogger();
  }
}
