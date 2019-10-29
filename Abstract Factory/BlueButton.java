public class BlueButton extends AButton{

    public static final String ANSI_RESET="\u001B[0m";
    public static final String ANSI_BLUE="\u001B[34m";

    @Override
    public void draw() {
        System.out.println(ANSI_BLUE+"Blue button is drawn\n"+ANSI_RESET);
    }


}
