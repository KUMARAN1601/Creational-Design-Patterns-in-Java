package BuilderExample;

public class UrlBuilder {
  public static class Builder{
    private String protocol;
    private String hostname;
    private String port;
    private String pathParam;
    private String queryParam;

    public Builder protocol(String protocol){
      this.protocol = protocol;
      return this;
    }
    public UrlBuilder build(){
      return new UrlBuilder(this);
    }
    public Builder hostname(String hostname){
      this.hostname=hostname;
      return this;
    }
    public Builder port(String port){
      this.port = port;
      return this;
    }
    public Builder pathParam(String pathParam){
      this.pathParam=pathParam;
      return this;
    }
    public Builder queryParam(String queryParam){
      this.queryParam=queryParam;
      return this;
    }
  }
  final String protocol;
  final String hostname;
  final String port;
  private final String pathParam;
  private final String queryParam;

  private UrlBuilder(Builder builder){
    this.protocol = builder.protocol;
    this.hostname=builder.hostname;
    this.port=builder.port;
    this.pathParam=builder.pathParam;
    this.queryParam=builder.queryParam;
  }
}
