/**
 * Fu-Hsuan Liu
 * fl1392@nyu.edu
 * Assignment 3, question 2
 * Mar 06, 2020
 * 0.5 hr
 * This program inicluding a main test file and a
 * Player class, which stores each player's 
 * atrributes as well as provides overriden equals().
 * The PlayerComapre class designed a compare function
 * which also take use of overriden equals().
 * We can see after overriding, even two objects are
 * in different address, we can get our expected result.
 */
public class testplayer {
    public static void main(String args[]) {
        Player p1 = new Player("Lebron", "Lakers", 23);
        Player p2 = new Player("James", "Lakers", 23);
        Player p3 = new Player("Luka", "Mavericks", 77);
        PlayerCompare comp = new PlayerCompare();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("");
        System.out.println("Is " + p1.getName() + " same as " + p2.getName() + " by '=='?   "  + (p1 == p2));
        System.out.println("Is " + p1.getName() + " same as " + p2.getName() + " by overriden equals()?   " + p1.equals(p2));
        System.out.print  ("Is " + p1.getName() + " same as " + p2.getName() + " by PlayerCpmpare after overriden equals()?   ");
        comp.isEqualto(p1, p2);
        System.out.println("Is " + p3.getName() + " same as " + p1.getName() + " by overriden equals()?   " + p3.equals(p1));
        System.out.print  ("Is " + p3.getName() + " same as " + p1.getName() + " by PlayerCpmpare after overriden equals()?   ");
        comp.isEqualto(p3, p1);
    }
}