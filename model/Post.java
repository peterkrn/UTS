package model;

import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;

public class Post {
    private String postID;
    private List<ContentStateEnum> contentStatus = new ArrayList<>();
    private Timestamp timeUpload;
    private List<ContentTypeEnum>  postType;
    private ArrayList<Comment> comments = new ArrayList<>();

    public Post(String postID, List<ContentStateEnum> contentStatus, Timestamp timeUpload, List<ContentTypeEnum>  postType) {
        this.postID = postID;
        this.contentStatus = contentStatus;
        this.timeUpload = timeUpload;
        this.postType = postType;
    }

    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public List<ContentStateEnum> getContentStatus() {
        return contentStatus;
    }

    public void setContentStatus(ArrayList<ContentStateEnum> contentStatus) {
        this.contentStatus = contentStatus;
    }

    public Timestamp getTimeUpload() {
        return timeUpload;
    }

    public void setTimeUpload(Timestamp timeUpload) {
        this.timeUpload = timeUpload;
    }

    public List<ContentTypeEnum> getPostType() {
        return postType;
    }

    public void setPostType(List<ContentTypeEnum> postType) {
        this.postType = postType;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comment) {
        this.comments = comment;
    }
}