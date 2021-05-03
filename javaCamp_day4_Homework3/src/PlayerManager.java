public class PlayerManager {
    PlayerCheckService playerCheckService;

    public PlayerManager(PlayerCheckService playerCheckService) {
        this.playerCheckService = playerCheckService;
    }

    public void add(Player player) {
        if (playerCheckService.checkIfRealPerson(player)) {
            System.out.println("The player named "+player.firstName+" was added");
        } else {
            System.out.println("The registered person was not found");
        }
    }

    public void update(Player player){
        System.out.println("The player named "+player.firstName+" was updated");
    }

    public void delete(Player player){
        System.out.println("The player named "+player.firstName+" was deleted");
    }
}
