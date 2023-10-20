package model;

import java.util.ArrayList;
import java.util.List;

public class Comment {
    private String commentID;
    private String text;
    private List<ContentStateEnum> contentStatus = new ArrayList<>();

    public Comment(String commentID, String text, List<ContentStateEnum> contentStatus) {
        this.commentID = commentID;
        this.text = text;
        this.contentStatus = contentStatus;
    }

    public String getCommentID() {
        return commentID;
    }

    public void setCommentID(String commentID) {
        this.commentID = commentID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<ContentStateEnum> contentStatus() {
        return contentStatus;
    }

    public void setStatus(ArrayList<ContentStateEnum> contentStatus) {
        this.contentStatus = contentStatus;
    }

}