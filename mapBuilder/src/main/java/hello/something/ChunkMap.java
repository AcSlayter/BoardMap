package hello.something;

/**
 * Created by aaron on 9/29/2018.
 */
public class ChunkMap {
//    private Chunk left;
//    private Chunk right;
//    private Chunk top;
//    private Chunk bottom;
    private Chunk current;

    public ChunkMap() {
        this.current = new Chunk().generate();
    }

    public Chunk getCurrent() {
        return current;
    }


}
