public class MernisCheckManager implements PlayerCheckService{
    @Override
    public boolean checkIfRealPerson(Player player) {
        return player.nationalityId.length()==11;
    }
}
