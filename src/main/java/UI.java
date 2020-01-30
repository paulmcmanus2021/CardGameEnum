import java.util.Scanner;

public class UI {

    public void welcome(){
        System.out.println("Welcome to the game.");
    }

    public String getPlayerName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter your name: ");
        String name = sc.nextLine();
        return name;
    }

    public void printPlayersCard(String name){
        System.out.println(name + " has the 2 of spades");
    }

}
