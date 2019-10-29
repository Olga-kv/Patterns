public class UsualFactory extends AbstractFactory {
    @Override
    public IButton getButton() {
        return new UsualButton();
    }

    @Override
    public IText getText() {
        return new UsualText();
    }
}
