package controller;

import model.*;
import java.util.*;

public class DummyController {
    ArrayList<User> user = new ArrayList<>();

    static java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf("2023-10-20 14:00:00.0");

    static List<ContentStateEnum> contentStatus = new ArrayList<>() {
        {
            add(ContentStateEnum.PINNED); // 01
            add(ContentStateEnum.SHOWED); // 12
            add(ContentStateEnum.ARCHIVED); // 23
            add(ContentStateEnum.DELETED); // 34
        }
    };

    static List<ContentTypeEnum> postType = new ArrayList<>() {
        {
            add(ContentTypeEnum.PICTURE);
            add(ContentTypeEnum.VIDEO);
        }
    };

    static ArrayList<Comment> comments = new ArrayList<>() {
        {
            add(new Comment("comment001", "Cool post!", contentStatus.subList(0, 1)));
            add(new Comment("comment002", "Looks awesome, bro!", contentStatus.subList(0, 1)));
            add(new Comment("comment003", "Nice!", contentStatus.subList(1, 2)));
            add(new Comment("comment004", "Why would you still have a dinner with your ex?",
                    contentStatus.subList(2, 3)));
            add(new Comment("comment005", "Isn't that your dad's car?", contentStatus.subList(3, 4)));
            add(new Comment("comment006", "Such a shame.", contentStatus.subList(1, 2)));
            add(new Comment("comment007", "Sure that looks amazing.", contentStatus.subList(1, 2)));
            add(new Comment("comment008", "Congrats!", contentStatus.subList(0, 1)));
        }
    };

    DummyController() {
        user.add(new User("1", "peterkrn", "peter123", "Informatics Engineering '22"));
        user.add(new User("2", "clairo", "claire123", "Singer-songwriter"));
        user.add(new User("3", "leodicaprio", "dicaprio123", "Oscar-winning actor"));

        user.get(0).getPosts().add(new Post("post001", contentStatus.subList(0, 1), timestamp, postType.subList(0, 1)));
        user.get(0).getPosts().get(0).getComments().add(comments.get(0));
    }
}
