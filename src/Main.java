public class Main {

    public static void main(String[] args) {

    Bayer bayer =new Bayer();

/*    VendingMachin vendingMachin = new VendingMachin();

    vendingMachin.showProducts();
    vendingMachin.setDrink(bayer.chooseBottom());
    vendingMachin.setMoney(bayer.moneyBayer());
    vendingMachin.getMoney();*/


    VendingMachinaForHotDrink vendingMachinaForHotDrink = new VendingMachinaForHotDrink();

    vendingMachinaForHotDrink.showProducts();
    vendingMachinaForHotDrink.setDrink(bayer.chooseBottom());
    vendingMachinaForHotDrink.setMoney(bayer.moneyBayer());
    vendingMachinaForHotDrink.getMoney();



    }
}
