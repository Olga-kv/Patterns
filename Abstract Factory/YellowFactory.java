public class YellowFactory extends AbstractFactory {
    @Override
    public IButton getButton() {
        return new YellowButton();
    }

    @Override
    public IText getText() {
        return new YellowText();
    }
}
