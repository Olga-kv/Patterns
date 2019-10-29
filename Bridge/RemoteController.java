import java.lang.module.InvalidModuleDescriptorException;

public class RemoteController implements IRemoteController {

    protected IDevice _device;

    RemoteController(IDevice device){
        this._device=device;
    }

    @Override
    public void Power() {
        if(_device.IsEnabled()){
            _device.Enabled();
        }
        else{
            _device.Disabled();
        }
    }

    @Override
    public void VolumeUp() {

        _device.SetVolume(_device.GetVolume()+10);
    }

    @Override
    public void VolumeDown() {
        _device.SetVolume(_device.GetVolume()-10);
    }

    @Override
    public void ChangeChannelUp() {
        _device.SetChannel(_device.getChannel()+1);
    }

    @Override
    public void ChangeChannelDown() {
        _device.SetChannel(_device.getChannel()-1);
    }
}
