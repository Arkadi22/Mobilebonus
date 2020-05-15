public class Main {
    public static void main(String[] args) {
        int refillAmount = 3000_00;
        int totalBonus;
        if (refillAmount >= 1000_00) {
            totalBonus = refillAmount / 100_00;
        } else {
            totalBonus = 0;
        }
        System.out.println(totalBonus);
    }
}
