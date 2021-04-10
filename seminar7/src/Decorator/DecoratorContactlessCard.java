package Decorator;

public class DecoratorContactlessCard extends DecoratorAbstracct{
    public DecoratorContactlessCard(CardBancar cardBancar) {
        super(cardBancar);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCardBancar()).getTitular()+ " a realizat o plata contactless");
    }
}
