package com.example.madmovegame.util;

import com.example.madmovegame.contest.model.Contest;
import com.example.madmovegame.contest.model.RankInfo;

import java.util.ArrayList;
import java.util.List;

public class MockData {

    public static List<Contest> getContestList() {
        List<Contest> list = new ArrayList<>();
        list.add(new Contest("Mega Contest", "Get Ready For Mega Winner", "21,60,000", "14,98,000", "8 Crores", "49"));
        list.add(new Contest("Only For Beginners", "Play Your First Constest Now", "21,60,000", "14,98,000", "10 Lacks", "10"));
        return list;
    }

    public static List<RankInfo> getRankInfo() {
        List<RankInfo> list = new ArrayList<>();
        list.add(new RankInfo("#1", "DEW", "2000000"));
        list.add(new RankInfo("#2", "AAYU", "8900000"));
        return list;
    }
}
