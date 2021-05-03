public class GameManager {

    public void add(Game game){
        System.out.println("Game was added :"+game.name);
    }

    public void update(Game game){
        System.out.println("Game was updated :"+game.name);
    }

    public void delete(Game game){
        System.out.println("Game was deleted :"+game.name);
    }
}
