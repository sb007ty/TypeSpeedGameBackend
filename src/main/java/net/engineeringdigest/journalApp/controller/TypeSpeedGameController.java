package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.Entity.LeaderBoardUser;
import net.engineeringdigest.journalApp.service.TypeSpeedGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/typespeedgame") // <<== Add this for URL path prefix
public class TypeSpeedGameController {

    @Autowired
    TypeSpeedGameService typeSpeedGameService;

    @GetMapping("/leaderboard")
    public List<LeaderBoardUser> getLeaderBoardDetails() {
        System.out.println(typeSpeedGameService.getLeaderBoardDetails().toString());
        return typeSpeedGameService.getLeaderBoardDetails();
    }

    @PostMapping("/updatescore")
    public LeaderBoardUser updateUserScore(@RequestBody  LeaderBoardUser user) {
        //if user exist -> modify
//        else -> add
        //for now only adding
        System.out.println(user.toString());
        user.setDate(LocalDateTime.now());
        return typeSpeedGameService.updateUserScore(user);

    }
}

