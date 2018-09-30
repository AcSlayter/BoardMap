package hello.something;

import java.util.Random;

/**
 * Created by aaron on 9/29/2018.
 */
public class Node {

    final private NodeType nodeType;

    public Node () {
        this.nodeType = randomNodeTpe();
    }

    public Node (NodeType nodeType){
        this.nodeType = nodeType;
    }

    private NodeType randomNodeTpe(){
        int pick = new Random().nextInt(NodeType.values().length);
        return NodeType.values()[pick];
    }

    public NodeType getNodeType() {
        return nodeType;
    }
}
