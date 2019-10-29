public interface IDevice {

    public boolean IsEnabled();

    public void Enabled();
    public void Disabled();

    public void SetVolume(int volume);
    public int GetVolume();

    public void SetChannel(int channel);
    public int getChannel();
}
