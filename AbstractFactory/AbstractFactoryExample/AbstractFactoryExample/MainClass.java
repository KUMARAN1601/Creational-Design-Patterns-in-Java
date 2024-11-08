package AbstractFactoryExample;

public class MainClass {
  public static void main(String[] args) {
    new AbstractFactoryProducer();
    AbstractFactory abstractFactory=AbstractFactoryProducer.getProfession(true);
    Profession engg=abstractFactory.getProfession("Engineer");
    engg.print();
  }
}
