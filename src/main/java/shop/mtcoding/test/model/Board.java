package shop.mtcoding.test.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

// title, user_id, created_at
@Getter
@Setter
public class Board {
    private int id;
    private String title;
    private int userId;
    private Timestamp createdAt;

}
