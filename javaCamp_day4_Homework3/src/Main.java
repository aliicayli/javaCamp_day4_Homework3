public class Main {

    public static void main(String[] args) {
        Player player1 = new Player(1, "Engin", "Demiroğ", "12345678901");
        Player player2 = new Player(2, "Ali", "Çaylı", "12345678902");

        Campaign campaign1 = new Campaign(1, "Small Campaign");
        Campaign campaign2 = new Campaign(2, "Big Campaign");

        Game game1 = new Game(1, "Game A");
        Game game2 = new Game(2, "Game B");


        PlayerManager playerManager = new PlayerManager(new MernisCheckManager());
        playerManager.add(player1);
        playerManager.add(player2);

        playerManager.update(player1);
        playerManager.update(player2);

        playerManager.delete(player1);
        playerManager.delete(player2);

        System.out.println("*******************************");

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign1);
        campaignManager.add(campaign2);

        campaignManager.update(campaign1);
        campaignManager.update(campaign2);

        campaignManager.delete(campaign1);
        campaignManager.delete(campaign2);

        System.out.println("*******************************");

        GameManager gameManager=new GameManager();
        gameManager.add(game1);
        gameManager.add(game2);

        gameManager.update(game1);
        gameManager.update(game2);

        gameManager.delete(game1);
        gameManager.delete(game2);

        System.out.println("*******************************");

        PriceManager priceManager=new PriceManager();
        priceManager.add(player1,game1,campaign1);
        priceManager.add(player2,game2,campaign2);

    }
}
