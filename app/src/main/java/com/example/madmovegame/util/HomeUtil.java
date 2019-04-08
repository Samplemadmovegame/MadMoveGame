package com.example.madmovegame.util;

import com.example.madmovegame.Const;
import com.example.madmovegame.home.model.AllSports;
import com.example.madmovegame.home.model.Sport;

import java.util.ArrayList;
import java.util.List;

public class HomeUtil {

    public static List<Sport> getSortsList() {
        List<Sport> sports = new ArrayList<>();
        sports.add(new Sport(Const.CRICKET));
        sports.add(new Sport(Const.BADMINTON));
        sports.add(new Sport(Const.FOOTBALL));
        sports.add(new Sport(Const.HOCKEY));
        sports.add(new Sport(Const.HOCKEY));
        sports.add(new Sport(Const.HOCKEY));
        sports.add(new Sport(Const.HOCKEY));
        sports.add(new Sport(Const.HOCKEY));
        return sports;
    }

    public static List<AllSports> getAllSportsCricketList() {
        List<AllSports> sports = new ArrayList<>();
        sports.add(new AllSports("CSK", "MUM", "Premier League", 0));
        sports.add(new AllSports("CSK", "MUM", "Premier League", 0));
        sports.add(new AllSports("CSK", "MUM", "Premier League", 0));
        sports.add(new AllSports("CSK", "MUM", "Premier League", 0));
        sports.add(new AllSports("CSK", "MUM", "Premier League", 0));
        sports.add(new AllSports("CSK", "MUM", "Premier League", 0));
        sports.add(new AllSports("CSK", "MUM", "Premier League", 0));
        sports.add(new AllSports("CSK", "MUM", "Premier League", 0));
        sports.add(new AllSports("CSK", "MUM", "Premier League", 0));
        return sports;
    }
}
