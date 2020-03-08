public class PlayerCompare {
    PlayerCompare(){};
    public void isEqualto(Player p1, Player p2) {
        if (p1.equals(p2)) 
            System.out.println("Same player");
        else
            System.out.println("Differemt players");
    }
}