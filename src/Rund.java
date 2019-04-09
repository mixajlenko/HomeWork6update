public class Rund {
    public static int getRandomValue(int min, int max) {

            max -= min;

            return (int) (Math.random() * max + 1) + min;
        }
}

