package BuilderExample;

public class MainBuilder {
  public static void main(String[] args){

    UrlBuilder.Builder builder=new UrlBuilder.Builder();
    builder.protocol("http://").hostname("newwebsite:").port("433");
    UrlBuilder urlBuilder=builder.build();

    System.out.println(urlBuilder.protocol);
    System.out.println(urlBuilder.hostname);
    System.out.println(urlBuilder.port);
  }
}
