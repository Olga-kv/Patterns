public class AdvancedRemoteController extends RemoteController {


    AdvancedRemoteController(IDevice device) {
        super(device);
    }



    public void Mute(){
        _device.SetVolume(0);
    }
}
