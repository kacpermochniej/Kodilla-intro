public class RandomNumbers {
    private int min = 31;
    private int max = -1;

    public void generateUntilLimit() {
        int sum = 0;

        while (sum <= 5000) {

            int currentDraw = (int) (Math.random() * 31);
            sum += currentDraw;

            if (currentDraw < min) {
                min = currentDraw;
            }

            if (currentDraw > max) {
                max = currentDraw;
            }
        }
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public static void main(String[] args) {
        RandomNumbers runner = new RandomNumbers();
        runner.generateUntilLimit();

        System.out.println("The smallest number drawn was: " + runner.getMin());
        System.out.println("The largest number drawn was: " + runner.getMax());
    }
}
