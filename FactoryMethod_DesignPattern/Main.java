package FactoryMethod_DesignPattern;

public class Main {
  public static void main(String[] args) {
    ILoggerFactory factory = new ErrorFactory();
    ILogger error =  factory.createLogger();
    error.log("Hey i am error logger");
  }
}
