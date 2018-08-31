public class VendingMachinaForHotDrink extends VendingMachin{

    private int money = 0;
    private String drink;
    private int addMoney;

    public VendingMachinaForHotDrink() {
        super();
    }

    public void showProducts(){//Показать список продуктов
        HotDrink hotDrink[]= HotDrink.values();
        for (int i =0;i<hotDrink.length;i++){
            System.out.println(hotDrink[i]);
        }
    }

    public void setDrink(int bottom) {//Как сделать чтобы при default прекращалась работа програмы без ошибки?

        switch (bottom){
            case 1: this.drink="LATTE";
                System.out.println("Вы выбрали: Латте");
                System.out.println("Внесите деньги: ");
                break;
            case 2: this.drink="MOKKO";
                System.out.println("Вы выбрали: Мокко");
                System.out.println("Внесите деньги: ");
                break;
            case 3: this.drink="TEA";
                System.out.println("Вы выбрали: Чай");
                System.out.println("Внесите деньги: ");
                break;
            default:
                this.drink="NONE";
                System.out.println("Такого напитка нет");
                break;
        }
    }

    public String getDrink() {
        HotDrink hotDrink = HotDrink.valueOf(this.drink);
        System.out.println("Возьмите ваш напиток: " + hotDrink.title);
        return drink;
    }

    public void setMoney(int money) {

        this.money=this.money+money;
        this.money = money;
        System.out.println("Сумма: " + this.money);
    }

    public int getMoney() {
        HotDrink hotDrink = HotDrink.valueOf(this.drink);
        if (this.money>=hotDrink.price){
            this.money=this.money-hotDrink.price;
            System.out.println("Ваша сдача: " + this.money);
            getDrink();
        }else{
            do {
                this.money+=setAddMoney();
            }while (this.money<hotDrink.price);
            this.money=this.money-hotDrink.price;
            System.out.println("Ваша сдача: " + this.money);
            getDrink();
        }
        return this.money;
    }

    @Override
    public int setAddMoney() {
        return super.setAddMoney();
    }
}
