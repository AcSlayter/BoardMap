package hello.something;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aaron on 9/29/2018.
 */
public class Board {
    private List<ChunkMap> chunkMapList;

    private ChunkMap currentLocation;
    private ChunkMap Start;

    public Board(){
        this.chunkMapList = new ArrayList<ChunkMap>();

        ChunkMap chunkMap = new ChunkMap();
        this.chunkMapList.add(chunkMap);
        this.currentLocation = chunkMap;
        this.Start = chunkMap;
    }

    public ChunkMap getCurrentLocation() {
        return currentLocation;
    }

}
