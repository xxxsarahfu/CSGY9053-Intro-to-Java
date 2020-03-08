/**
 * Fu-Hsuan Liu
 * fl1392@nyu.edu
 * Assignment 3, question 3
 * Mar 06, 2020
 * 0.5 hr
 * This program including a main test file and a enum class
 * with abstract method. By calling printColor and colorCombo
 * we can see the color of each COLOR object and their primary 
 * color composition.
 */
class EnumDemo {
    public static void main(String args[]) {
        COLORS black = COLORS.BLACK;
        COLORS blue = COLORS.BLUE;
        COLORS red = COLORS.RED;
        COLORS green = COLORS.GREEN;
        COLORS yellow = COLORS.YELLOW;

        black.printColor();
        blue.printColor();
        red.printColor();
        green.printColor();
        yellow.printColor();

        black.colorCombo();
        blue.colorCombo();
        red.colorCombo();
        green.colorCombo();
        yellow.colorCombo();
    }
}   