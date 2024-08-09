public class GuessIt2 {



    public static void main(String[] args) {
        System.out.println();
        String card = "ace";
        int currentTotalValue = 15;

        int currentValue = switch (card) {
            case "king", "queen", "jack" -> 10;
            case "ace" -> {
                if(currentTotalValue < 11) {
                    yield 11;
                } else {
                    yield 1;
                }
            }
            default -> Integer.parseInt(card);

        };
        System.out.printf("Current Card Value: %d%n", currentValue);
        System.out.printf("Total Value: %d%n", currentTotalValue + currentValue);
    }
}
