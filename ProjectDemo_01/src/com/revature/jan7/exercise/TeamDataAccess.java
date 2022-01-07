package com.revature.jan7.exercise;

public interface TeamDataAccess {
    void win(SuperBowl superBowl);
    SuperBowl read();
    SuperBowl update(SuperBowl superBowl);
}
