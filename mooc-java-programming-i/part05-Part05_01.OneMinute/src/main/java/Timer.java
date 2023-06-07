public class Timer {
    private ClockHand milliseconds;
    private ClockHand seconds;

    public Timer() {
        this.milliseconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance (){
        this.milliseconds.advance();

        if (this.milliseconds.value() == 0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
       return seconds + ":" + milliseconds;
    }
}
