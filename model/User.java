package model;

import java.util.ArrayList;

public class User {
    private String userID;
    private String username;
    private String password;
    private String bio;
    private ArrayList<Post> posts = new ArrayList<>();

    public User(String userID, String username, String password, String bio) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.bio = bio;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPost(ArrayList<Post> posts) {
        this.posts = posts;
    }
}