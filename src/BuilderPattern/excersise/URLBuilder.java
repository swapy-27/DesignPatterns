package BuilderPattern.excersise;

public class URLBuilder
{
    private String protocol;
    private int port;
    private String hostName;
    private String pathParam ;
    private String queryParam ;

    URLBuilder(Builder builder){
        this.hostName= builder.hostName;
        this.port= builder.port;
        this.protocol= builder.protocol;
        this.pathParam= builder.pathParam;
        this.queryParam= builder.queryParam;

    }

    @Override
    public String toString() {
        return "URLBuilder{" +
                "protocol='" + protocol + '\'' +
                ", port=" + port +
                ", hostName='" + hostName + '\'' +
                ", pathParam='" + pathParam + '\'' +
                ", queryParam='" + queryParam + '\'' +
                '}';
    }

    static class Builder{
        private String protocol;
        private int port;
        private String hostName;
        private String pathParam ;
        private String queryParam ;

        public Builder setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setPort(int port) {
            this.port = port;
            return this;
        }

        public Builder setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder setPathParam(String pathParam) {
            this.pathParam = pathParam;
            return this;
        }

        public Builder setQueryParam(String queryParam) {
            this.queryParam = queryParam;
            return this;
        }

        public URLBuilder build(){
            return new URLBuilder(this);
        }
    }
}
