public class Radio implements IDevice {

    protected boolean _isEnabled=false;
    protected int _itsVolume=20;
    protected int _itsChannel=2;

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
        return this._itsVolume;
    }

    @Override
    public void SetChannel(int channel) {
        this._itsChannel=channel;

    }

    @Override
    public int getChannel() {
        return this._itsChannel;
    }

    public void PrintInfo(){

        System.out.println("Radio");
        System.out.println("It is " + (_isEnabled ? "enabled" : "disabled"));
        System.out.println("Current volume is " + _itsVolume + "%");
        System.out.println("Current channel is " + _itsChannel);

    }
}
