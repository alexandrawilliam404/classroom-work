public static int getRandomNumber(int min, int max) {
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
}
