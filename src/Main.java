public class Main {
    public static void main(String[] args) {
        int phoneBalance = 1000;
        int replenishment = 446;
        int replenishment2 = 2235;
        if(replenishment < 1000){
            System.out.println("Счет пополнен на " + replenishment);
            System.out.println("Бонусных рублей начислено: 0");
            System.out.println("Всего на счету: " + (replenishment + phoneBalance));
        }
        System.out.println("_____________________________");
        if (replenishment2 > 1000){
            System.out.println("Счет пополнен на " + replenishment2);
            int bonus = replenishment2 / 100 * 1;
            System.out.println("Бонусных рублей начислено: " + bonus);
            System.out.println("Всего на счету: " + (phoneBalance + replenishment2 + bonus));
        }
    }
}
