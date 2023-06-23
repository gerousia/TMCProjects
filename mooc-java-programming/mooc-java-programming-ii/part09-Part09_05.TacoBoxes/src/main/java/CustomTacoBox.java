public class CustomTacoBox implements TacoBox{
    private int taco;

    public CustomTacoBox(int taco) {
        this.taco = taco;
    }


    @Override
    public int tacosRemaining() {
        return taco;
    }

    @Override
    public void eat() {
        if (taco > 0) {
            --taco;
        }
    }
}
