package controller;

import model.*;
import java.util.*;

public class Controller {
    private DummyController dummyCtrl = new DummyController();

    public String showUserPosts(int userID) {
        String text = "";
        ArrayList<Post> postsTmp = dummyCtrl.user.get(userID).getPosts();
        if (postsTmp.isEmpty()) {
            text = "No posts yet";
        }

        ArrayList<ContentStateEnum> showPostOrder = new ArrayList<>(List.of(ContentStateEnum.PINNED, ContentStateEnum.SHOWED, ContentStateEnum.ARCHIVED, ContentStateEnum.DELETED));

        for (ContentStateEnum tempEnum : showPostOrder) {
            for (Post tmp : postsTmp) {
                if (tmp.getContentStatus().contains(tempEnum)) {
                    String postType;

                    if (tmp instanceof Feed) {
                        postType = ((Feed) tmp).getCaption();
                    } else if (tmp instanceof Story) {
                        postType = ((Story) tmp).getDuration() + " seconds" + " - " + ((Story) tmp).getViews() + " views";
                    } else if (tmp instanceof Reel) {
                        postType = ((Reel) tmp).getDuration() + " seconds" + " - " + ((Reel) tmp).getPlayedCount() + " played";
                    } else {
                        postType = "Unknown";
                    }

                    String resultState = "";
                    for (ContentStateEnum tempEnum2 : tmp.getContentStatus()) {
                        resultState += tempEnum2 + ", ";
                    }

                    int count = 0;
                    for (int i = 0; i < tmp.getComments().size(); i++) {
                        if (tmp.getComments() != null) {
                            count++;
                        }
                    }

                    text += "Post ID: " + tmp.getPostID() + "\n" +
                            "Content Status: " + resultState + "\n" +
                            "Time Upload: " + tmp.getTimeUpload() + "\n" +
                            "Post Type: " + tmp.getPostType() + "\n" +
                            "Post Type Detail: " + postType + "\n" +
                            "Comments: " + count + "\n\n";
                }
            }
        }
        return text;
    }
}