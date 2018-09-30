package hello.something;

/**
 * Created by aaron on 9/29/2018.
 */
public enum NodeType {
    path("path"),sign("sign"),grass("grass"),rock("rock");

    private String value;

    NodeType(String value) {
        this.value = value;
    }
    String getValue(){
        return this.value;
    }


}
