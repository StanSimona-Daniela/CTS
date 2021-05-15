package Decorator;

public class Main {  //6
    public static void main(String[] args) {
// adaugare functionalitati la altele vechi
        Card card= new Card("EU"); //card pe care il decoram mai tarziu
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
