public class CardReader implements ISD {

    MicroSD _micro = new MicroSD();

    public CardReader(MicroSD micro){
        _micro=micro;

    }

    @Override
    public void MatchUsualSlot() {
        _micro.MatchMicroSlot();

    }
}
