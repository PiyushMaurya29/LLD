package FactoryMethod_DesignPattern;

public class Main {
  public static void main(String[] args) {
    ILoggerFactory factory = new ErrorFactory();
    ILogger errorE =  factory.createLogger();
    errorE.log("Hey i am error logger");
  }
}
