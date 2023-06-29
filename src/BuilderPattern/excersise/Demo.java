package BuilderPattern.excersise;

public class Demo {
    public static void main(String[] args) {
        URLBuilder.Builder builder = new URLBuilder.Builder();


        URLBuilder url = builder.setHostName("localhost").setProtocol("https:").setPort(8080).build();

        System.out.println(url.toString());
    }
}
