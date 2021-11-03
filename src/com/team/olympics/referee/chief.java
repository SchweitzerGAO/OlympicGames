package com.team.olympics.referee;

import com.team.olympics.foul.foul;




import java.util.Random;

public class chief extends referee {
    public chief(String game) {
        super(game);
    }

    public boolean process(foul Foul) {
        boolean result = (new Random().nextInt(10)) > 3;//30%几率不判罚
        String log = "主裁<%s>判决<%s>的犯规，犯规等级：<%d>，判罚结果：<%s>";
        System.out.printf((log) + "%n", this.game, Foul.getGame(), Foul.getlevel(), result ? "批准" : "不批准");
        //(String.format(log, this.game, Foul.getGame(),Foul.getlevel(), result ? "批准" : "不批准"));
        //
        //判罚通过
        return result;
    }

}
