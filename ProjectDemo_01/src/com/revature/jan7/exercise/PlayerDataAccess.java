package com.revature.jan7.exercise;

public interface PlayerDataAccess {
    void save(SuperBowl superBowl);
    SuperBowl read();
    SuperBowl update(SuperBowl superBowl);
    void delete();
}
