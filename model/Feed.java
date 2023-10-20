package model;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Feed extends Post {
    private String caption;
    private int likes;

    public Feed (String postID, ArrayList<ContentStateEnum> contentStatus, Timestamp timeUpload, ContentTypeEnum postType, String caption, int likes) {
        super(postID, contentStatus, timeUpload, postType);
        this.caption = caption;
        this.likes = likes;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}