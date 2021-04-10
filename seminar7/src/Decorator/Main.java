package Decorator;

public class Main {
    public static void main(String[] args) {

        Card card= new Card("EU");
        card.platesteOnline();
        card.platestePOS();
        DecoratorContactlessCard decoratorContactlessCard = new DecoratorContactlessCard(card);
        decoratorContactlessCard.platesteContactless();
        decoratorContactlessCard.platesteOnline();
        System.out.println("---------------------------");
        DecoratorContactlessTelefon decoratorContactlessTelefon = new DecoratorContactlessTelefon(card);
        decoratorContactlessTelefon.platestePOS();
        decoratorContactlessTelefon.platesteContactless();


    }
}
