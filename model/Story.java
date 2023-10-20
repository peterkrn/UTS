package model;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Story extends Post {
    private int duration;
    private int views;

    public Story(String postID, ArrayList<ContentStateEnum> contentStatus, Timestamp timeUpload, ContentTypeEnum postType, int duration, int views) {
        super(postID, contentStatus, timeUpload, postType);
        this.duration = duration;
        this.views = views;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}