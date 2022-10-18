package ss4classvsobiject.exercise.stopwatch;

import java.util.Date;

public class StopWatch {
    private long starTime, endTime;

    public StopWatch() {

    }

    public StopWatch(long starTime, long endTime) {
        this.starTime = starTime;
        this.endTime = endTime;
    }

    public long getStarTime() {
        return starTime;
    }

    public void setStarTime(long starTime) {
        this.starTime = starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long star() {
        this.starTime = System.currentTimeMillis();
        return this.starTime;
    }

    public long end() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }

    public long getElapsedTime() {
        long timePast = this.getEndTime() - this.getStarTime();
        return timePast;
    }
}
