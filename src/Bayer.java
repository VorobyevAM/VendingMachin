import java.util.Scanner;

public class Bayer {

    public int chooseBottom(){
        System.out.println("Нажмите на кнопку с номером напитка: ");
        int chooseBottom;
        Scanner scanner = new Scanner(System.in);
        chooseBottom=scanner.nextInt();
        return chooseBottom;
    }

    public int moneyBayer(){

        int moneyBayer;
        Scanner scanner = new Scanner(System.in);
        moneyBayer=scanner.nextInt();
        return moneyBayer;
    }

}
