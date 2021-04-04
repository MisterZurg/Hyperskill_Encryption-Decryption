class Main {
    public static void main(String[] args) {
        new java.util.Scanner(System.in)
                .tokens()
                .sorted((a, b) -> b.length() - a.length())
                .findFirst()
                .ifPresent(System.out::print);
    }
}
