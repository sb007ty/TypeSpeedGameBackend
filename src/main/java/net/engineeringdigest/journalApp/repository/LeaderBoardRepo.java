package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.Entity.LeaderBoardUser;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LeaderBoardRepo extends MongoRepository<LeaderBoardUser, String> {

}
