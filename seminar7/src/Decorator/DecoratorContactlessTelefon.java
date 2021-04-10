package Decorator;

public class DecoratorContactlessTelefon extends DecoratorAbstracct {

    public DecoratorContactlessTelefon(CardBancar cardBancar) {
        super(cardBancar);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCardBancar()).getTitular()+ " a realizat o plata contactless cu telefonul");
    }
}
