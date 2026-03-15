package FactoryMethod_DesignPattern;

class InfoFactory implements ILoggerFactory {
  public ILogger createLogger(){
    return new InfoLogger();
  }
}