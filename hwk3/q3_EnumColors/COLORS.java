public enum COLORS { 
    BLACK {
        @Override
        public boolean colorCombo() {
            System.out.println("Black is Formed by combination of red, yellow and blue.");
            return false;
        }
    },
    RED {
        @Override
        public boolean colorCombo() {
            System.out.println("Red is the primary color.");
            return true;
        }
    },
    BLUE {
        @Override
        public boolean colorCombo() {
            System.out.println("Blue is the primary color.");
            return true;
        }
    },
    GREEN {
        @Override
        public boolean colorCombo() {
            System.out.println("Green is Formed by combination of yellow and blue.");
            return false;
        }
    },
    YELLOW {
        @Override
        public boolean colorCombo() {
            System.out.println("Yellow is the primary color.");
            return true;
        }
    };

	//SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
	public COLORS printColor() { 
        switch(this) {
            case BLACK:
                System.out.println("BLACK");
                break;
            case RED:
                System.out.println("RED");
                break;
            case BLUE:
                System.out.println("BLUE");
                break;
            case GREEN:
                System.out.println("GREEN");
                break;
            case YELLOW:
                System.out.println("YELLOW");
                break;
        }

        return this; 
    }

    public abstract boolean colorCombo();
}