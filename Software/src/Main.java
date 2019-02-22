import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Mall mall = new Mall();
        System.out.println("Did you wanna enter into the mall?");
        String ans = sc.next();
        if (ans.equals("Yes")) {
            mall = new Mall("Dostyk Plaza", s);
            System.out.println("1 - Enter into the shoe shop");
            System.out.println("2 - Enter into the game shop");
            System.out.println("3 - Enter into the book shop");
            System.out.println("4 - Enter into the shoe shop");
            int inp = sc.nextInt();
            if (inp == 4) {
                System.out.println("Good bye!");
            } else if (inp == 1)
                mall.addStore("Shoe");
            else if (inp == 2)
                mall.addStore("Game");
            else if (inp == 3)
                mall.addStore("Book");
        }
        else{
            System.out.println("Good bye!");
        }
    }
}
