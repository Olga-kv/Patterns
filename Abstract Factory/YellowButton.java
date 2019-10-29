public class YellowButton extends AButton {

    public static final String ANSI_RESET="\u001B[0m";
    public static final String ANSI_YELLOW="\u001B[33m";

    @Override
    public void draw() {
        System.out.println(ANSI_YELLOW+"Yellow button is drawn\n"+ANSI_RESET);
    }
}
