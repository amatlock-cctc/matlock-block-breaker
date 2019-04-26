package com.cctc.amatlock.test;

import java.io.Serializable;
import java.util.Comparator;

public class Score implements Serializable, Comparator<Score>
{
    private int score;
    private String name;

    public Score(String name, int score)
    {
        this.score = score;
        this.name = name;
    }

    public int compare(Score score1, Score score2)
    {
        int sc1 = score1.getScore();
        int sc2 = score2.getScore();

        if(sc1 > sc2)
        {
            return -1;
        }
        else if(sc1 < sc2)
        {
            return 1;
        }

        return 0;
    }

    public int getScore()
    {
        return score;
    }
    public String getName()
    {
        return name;
    }
}
