package Voting_System;

import java.util.Timer;
import java.util.TimerTask;

public class VotingTimer {

    private static Timer timer = new Timer();
    private static boolean votingActive = false; // Flag to track if voting is allowed
    private static TimerTask stopTask;           // Task for stopping voting
    private static long durationMillis = 30 * 60 * 1000; // 30 minutes in milliseconds

    public static boolean startOrStopVoting() {
        if (votingActive) {
            // If voting is already active, stop it immediately
            stopVoting();
            System.out.println("Voting has been stopped immediately.");
        } else {
            // If voting is not active, start it for 30 minutes
            startVoting();
            System.out.println("Voting has started for 30 minutes.");
        }
        return votingActive;
    }

    private static void startVoting() {
        votingActive = true;

        // Schedule a task to stop voting after 30 minutes
        stopTask = new TimerTask() {
            @Override
            public void run() {
                stopVoting();
                System.out.println("Voting stopped time over.");
            }
        };
        timer.schedule(stopTask, durationMillis);
    }

    private static void stopVoting() {
        votingActive = false;

        // Cancel the stopTask if it's scheduled
        if (stopTask != null) {
            stopTask.cancel();
        }
    }

    public static boolean isVotingActive() {
        return votingActive;
    }

}
