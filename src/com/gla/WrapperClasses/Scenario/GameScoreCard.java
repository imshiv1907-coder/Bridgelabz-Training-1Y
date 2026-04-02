package com.gla.WrapperClasses.Scenario;
import java.util.*;

public class GameScoreCard {

        public static void main(String[] args) {
            Integer[] scores = {10, null, 20, 15, null, 30};

            int notPlayedCount = 0;
            int totalScore = 0;

            for (Integer score : scores) {
                if (score == null) {
                    notPlayedCount++;
                } else {
                    totalScore += score;
                }
            }

            System.out.println("Players who haven't played: " + notPlayedCount);
            System.out.println("Total Score (valid players): " + totalScore);
        }

}
