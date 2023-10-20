package model;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Reel extends Post {
    private int duration;
    private int playedCount;

    public Reel(String postID, ArrayList<ContentStateEnum> contentStatus, Timestamp timeUpload, ContentTypeEnum postType, int duration, int playedCount) {
        super(postID, contentStatus, timeUpload, postType);
        this.duration = duration;
        this.playedCount = playedCount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPlayedCount() {
        return playedCount;
    }

    public void setPlayedCount(int playedCount) {
        this.playedCount = playedCount;
    }
}