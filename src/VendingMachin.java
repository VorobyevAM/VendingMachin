public class VendingMachin {
    private int money = 0;
    private String drink;
    private int addMoney;


    public VendingMachin() {
    }

    Bayer bayer = new Bayer();

    public void showProducts(){//Показать список продуктов
        ColdDrink coldDrink[]=ColdDrink.values();
        for (int i =0;i<coldDrink.length;i++){
            System.out.println(coldDrink[i]);
        }
    }

    public void setDrink(int bottom) {//Как сделать чтобы при default прекращалась работа програмы без ошибки?

        switch (bottom){
            case 1: this.drink="COCA_COLA";
                System.out.println("Вы выбрали: Кока-кола");
                System.out.println("Внесите деньги: ");
                break;
            case 2: this.drink="FANTA";
                System.out.println("Вы выбрали: Фанта");
                System.out.println("Внесите деньги: ");
                break;
            case 3: this.drink="SPRITE";
                System.out.println("Вы выбрали: Спрайт");
                System.out.println("Внесите деньги: ");
                break;
            default:
                this.drink="NONE";
                System.out.println("Такого напитка нет");
                break;
        }
    }

    public String getDrink() {
        ColdDrink coldDrink = ColdDrink.valueOf(this.drink);
        System.out.println("Возьмите ваш напиток: " + coldDrink.title);
        return drink;
    }

    public void setMoney(int money) {

        this.money=this.money+money;
        this.money = money;
        System.out.println("Сумма: " + this.money);
    }

    public int getMoney() {
        ColdDrink coldDrink = ColdDrink.valueOf(this.drink);
        if (this.money>=coldDrink.price){
            this.money=this.money-coldDrink.price;
            System.out.println("Ваша сдача: " + this.money);
            getDrink();
        }else{
            do {
                    this.money+=setAddMoney();
            }while (this.money<coldDrink.price);
            this.money=this.money-coldDrink.price;
            System.out.println("Ваша сдача: " + this.money);
            getDrink();
        }
        return this.money;
    }

    public int setAddMoney() {
        System.out.println("Внесите деньги: ");
        addMoney=bayer.moneyBayer();
        return this.addMoney = addMoney;
    }
}
