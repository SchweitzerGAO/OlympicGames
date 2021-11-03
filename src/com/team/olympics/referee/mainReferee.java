package com.team.olympics.referee;

import com.team.olympics.foul.foul;

import java.util.Random;

public class mainReferee extends referee {
    public mainReferee(String game) {
        super(game);
    }

    public boolean process(foul Foul) {
        boolean result = (new Random().nextInt(10)) > 3;//大于三为判罚
        String log = "主裁<%s>判决<%s>的犯规，犯规等级：<%d>，判罚结果：<%s>";
        System.out.printf((log) + "%n", this.game, Foul.getGame(), Foul.getlevel(), result ? "批准" : "不批准");

        if (!result) {
            //不批准
            return false;
        } else if (Foul.getlevel() <= 2) {
            return true;
        }
        return next.process(Foul);
    }

}
