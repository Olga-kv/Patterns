public class TV implements IDevice {

    protected boolean _isEnabled=false;
    protected int _itsVolume =10;
    protected int _itsChannel=6;

    @Override
    public boolean IsEnabled() {

        return this._isEnabled;
    }

    @Override
    public void Enabled() {
        this._isEnabled=true;

    }

    @Override
    public void Disabled() {
       this._isEnabled=false;

    }

    @Override
    public void SetVolume(int volume) {
        this._itsVolume=volume;
    }

    @Override
    public int GetVolume() {
        return _itsVolume;
    }

    @Override
    public void SetChannel(int channel) {
        _itsChannel=channel;
    }

    @Override
    public int getChannel() {
        return _itsChannel;
    }

    public void PrintInfo(){

        System.out.println("\nTV set");
        System.out.println("It is " + (_isEnabled ? "enabled" : "disabled"));
        System.out.println("Current volume is " + _itsVolume + "%");
        System.out.println("Current channel is " + _itsChannel);

    }
}
