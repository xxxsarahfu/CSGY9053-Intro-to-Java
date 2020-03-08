public class Player {
    private String name, team; 
    private int uniformNum;

    Player(String name, String team, int num) {
        this.name = name;
        this.team = team;
        this.uniformNum = num;
    }
    
    public String getName() {
        return this.name;
    }

    public String getTeam() {
        return this.team;
    }
    
    public int getNum() {
        return this.uniformNum;
    }

    @Override
    public boolean equals(Object o)  {
        Player p2 = (Player) o;
        return (p2.getTeam() == this.team && p2.getNum() == this.uniformNum);
    }

    @Override
    public String toString() {
        return "Player " + this.name + " is no." + this.uniformNum + " in " + this.team + ".";
    }
}
