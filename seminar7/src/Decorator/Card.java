package Decorator;

public class Card implements CardBancar{
    String titular;

    public String getTitular() {
        return titular;
    }

    public Card(String titular) {
        this.titular = titular;
    }

    @Override
    public void platestePOS() {
        System.out.println(this.titular+ " a platit cu POS");
    }

    @Override
    public void platesteOnline() {
        System.out.println(this.titular+ " a platit online");
    }
}
