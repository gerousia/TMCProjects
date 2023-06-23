public class Whistle {
    private String whistleSound;

    public Whistle(String whistleSound) {
        this.whistleSound = whistleSound;
    }

    public void sound() {
        System.out.println(whistleSound);
    }
}
