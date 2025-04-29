package net.engineeringdigest.journalApp.Entity;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "LeaderBoard")
public class LeaderBoardUser {


//    @Id
//    private ObjectId id;
    @Id
    private String userId;
    private Integer score;
    private LocalDateTime date;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
//    public ObjectId getId() {
//        return id;
//    }
//
//    public void setId(ObjectId id) {
//        this.id = id;
//    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "LeaderBoardUser{" +
                "userId='" + userId + '\'' +
                ", score=" + score +
                '}';
    }
//    public Integer getRank() {
//        return rank;
//    }
//
//    public void setRank(Integer rank) {
//        this.rank = rank;
//    }
}
