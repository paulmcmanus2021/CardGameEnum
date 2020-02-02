public class Runner {

    public static void main(String[] args) {
        UI ui = new UI();
        ui.welcome();
        String name = ui.getPlayerName();
        ui.printPlayersCard(name);
    }
}
