public class Main {
    public static void main(String[] args) {
        int phoneBalance = 1000;
        int replenishment = 1200;
        int bonus = replenishment / 100 * 1;
        if (replenishment < 1000) {
            System.out.println("Счет пополнен на " + replenishment);
            System.out.println("Бонусных рублей начислено: 0");
            System.out.println("Всего на счету: " + (replenishment + phoneBalance));
        } else {
            System.out.println("Счет пополнен на " + replenishment);
            System.out.println("Бонусных рублей начислено: " + bonus);
            System.out.println("Всего на счету: " + (phoneBalance + replenishment + bonus));
        }
    }
}
