package Decorator;
//primeste un card
public abstract class DecoratorAbstracct implements CardBancar {
    private CardBancar cardBancar;

    public DecoratorAbstracct(CardBancar cardBancar) {
        this.cardBancar = cardBancar;
    }
    public abstract void platesteContactless();

    public CardBancar getCardBancar() {
        return cardBancar;
    }

    @Override
    public void platestePOS() {
        this.cardBancar.platestePOS();
    }

    @Override
    public void platesteOnline() {
        this.cardBancar.platesteOnline();
    }
}
