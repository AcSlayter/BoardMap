package api.board;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aaron on 9/29/2018.
 */
public class Chunk {

    private int height = 0;
    private int width = 0;

    private List<Node> nodeSet;

    public Chunk(){
        this(30,30);
    }

    public Chunk(int height, int width){
        this.height = height;
        this.width = width;
    }

    public Chunk generate() {
        int size = this.height*this.width;
        this.nodeSet = new ArrayList<Node>(this.height*this.width);
        for ( int index = 0 ; index < size; index++ ) {
            this.nodeSet.add(new Node());
        }
        return this;
    }

    public List<Node> getNodeSet() {
        return nodeSet;
    }
    public int getWidth() {
        return width;
    }




}
