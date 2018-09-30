package hello.example;

/**
 * Created by aaron on 9/29/2018.
 */
public class Greeting {
    private final String content;
    private final int id;

    public Greeting(String content) {
        this.content = content;
        this.id = 45;
    }

    public String getContent() {
        return content;
    }

    public int getId() {
        return id;
    }

}