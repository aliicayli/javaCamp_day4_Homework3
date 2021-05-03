public class CampaignManager {

    public void add(Campaign campaign){
        System.out.println("Campaign was added :"+campaign.campaignName);
    }

    public void update(Campaign campaign){
        System.out.println("Campaign was updated :"+campaign.campaignName);
    }

    public void delete(Campaign campaign){
        System.out.println("Campaign was deleted :"+campaign.campaignName);
    }
}
