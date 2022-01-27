class Converter {
    public static void main(String[] args) {
        long giga = 500;
        long gibi = 0;

        gibi = (long) (giga * 1e9 / Math.pow(2, 30));
        System.out.println(giga + "GB = " + gibi + "GiB");
    }
}