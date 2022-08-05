package ss4class.exercise.stopwatch;

public class stopwatch {
    private long startTime, endTime;

    public  stopwatch(){

    }
    public stopwatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;

    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long star() {
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }

    public long stop() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }
    public long getElapsedTime(){
        long result = this.getEndTime() - this.getStartTime();
        return result;
    }
}
