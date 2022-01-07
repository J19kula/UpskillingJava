package com.revature.jan7.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuperBowl {
    int players;
    String winners;
    String losers;
    String mvp;
}
