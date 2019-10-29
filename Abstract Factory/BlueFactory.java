public class BlueFactory extends AbstractFactory {
    @Override
    public IButton getButton() {
        return new BlueButton();
    }

    @Override
    public IText getText() {
        return new BlueText();
    }
}
