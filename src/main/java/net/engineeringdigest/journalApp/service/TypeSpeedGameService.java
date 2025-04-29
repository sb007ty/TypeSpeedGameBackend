package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.Entity.LeaderBoardUser;
import net.engineeringdigest.journalApp.repository.LeaderBoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeSpeedGameService {
    @Autowired
    private LeaderBoardRepo leaderBoardRepo;

    public List<LeaderBoardUser>getLeaderBoardDetails(){
        return leaderBoardRepo.findAll();
    }
    public LeaderBoardUser updateUserScore(LeaderBoardUser user){
        return leaderBoardRepo.save(user);
    }
}
